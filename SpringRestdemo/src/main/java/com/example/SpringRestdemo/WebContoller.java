package com.example.SpringRestdemo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebContoller 
{
	@RequestMapping("/sample")
    public SampleResponse Sample(@RequestParam(value = "name", defaultValue = "Robot") String name) {
        SampleResponse response = new SampleResponse();
        response.setId(1);
        response.setMsg("Your name is "+name);
        return response;
	}
        
        @RequestMapping(value = "/test", method = RequestMethod.POST)
        public PostResponse Test(@RequestBody PostRequest inputPayload) {
            PostResponse response = new PostResponse();
            response.setId(inputPayload.getId()*100);
            response.setName("Hello " + inputPayload.getName());
            response.setAddress("Some text");
            return response;
 
    }
}
