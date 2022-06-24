package com.api.FeignApplication1;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@org.springframework.cloud.openfeign.FeignClient(name = "${feign.name}", url = "${feign.url}")
public interface FeignClient {
	@GetMapping("/table/{num}")
	public List<String> printTable(@PathVariable("num") int num);
}
