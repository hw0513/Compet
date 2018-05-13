package competition.controller;


import competition.Utils.FileUtil;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@RestController
@RequestMapping("/upload")
public class UploadingController {

    /**
     * 上传文件
     *
     * @param file
     * @param request
     * @return 文件地址
     */
    @RequestMapping(value = "/testuploadimg", method = RequestMethod.POST)
    public @ResponseBody
    String uploadImg(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        System.out.println("OK");
        String contentType = file.getContentType();
        String fileName = UUID.randomUUID().toString().replace("-", "") + '.' + contentType.split("/")[1];
        String filePath = request.getSession().getServletContext().getRealPath("imgupload/");
        try {
            FileUtil.uploadFile(file.getBytes(), filePath, fileName);
        } catch (Exception e) {

            // TODO: handle exception
        }
        //返回json
        return filePath + fileName;
    }
}
