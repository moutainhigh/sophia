package com.yz.sophia.insight.provider;

import com.yz.sophia.business.api.entity.CommonResponse;
import com.yz.sophia.insight.model.request.CustomerAddReq;
import com.yz.sophia.insight.model.response.CustomerDetailsResp;
import com.yz.sophia.insight.model.response.LzSearchBodyResp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;


/**
 * FeignClient命名规则说明:
 * name 为提供服务的${spring.application.name}名称,不能写错,否则使用api的客户端在注册中心无法找到对应的服务。
 * 		比如sophia-b2b-insight-provider 为sophia-b2b-insight项目provider模块提供的服务
 * path 为api的相对路径,格式:${server.servlet.context-path|/相对路径
 * 		比如/api/customer
 */
@Api("Lz数据检索服务")
@FeignClient(name = "sophia-b2b-insight-provider",path = "/api/lz")
@RequestMapping("/search")
public interface LzSearchProvider {

	// 服务中方法的映射路径,确保参数一致
	@GetMapping("/searchArticlesByKeyword")
	@ApiOperation("按关键词获取文章接口")
	CommonResponse<LzSearchBodyResp> searchArticlesByKeyword(@RequestParam("keyword") String keyword, @RequestParam("emotion") Integer emotion, @RequestParam("position") Integer position, @RequestParam("startTime") String startTime, @RequestParam("endTime") String endTime, @RequestParam("pageIndex") int pageIndex, @RequestParam("pageRows") int pageRows);

	@GetMapping("/searchArticlesByWebsite")
	@ApiOperation("按网站获取文章接口")
	CommonResponse<LzSearchBodyResp> searchArticlesByWebsite(@RequestParam("domain") String domain, @RequestParam("emotion") Integer emotion, @RequestParam("startTime") String startTime, @RequestParam("endTime") String endTime, @RequestParam("pageIndex") int pageIndex, @RequestParam("pageRows") int pageRows);

	@GetMapping("/searchArticlesBySource")
	@ApiOperation("按媒体类型获取文章接口")
	CommonResponse<LzSearchBodyResp> searchArticlesBySource(@RequestParam("sourceType") String sourceType, @RequestParam("emotion") Integer emotion, @RequestParam("startTime") String startTime, @RequestParam("endTime") String endTime, @RequestParam("pageIndex") int pageIndex, @RequestParam("pageRows") int pageRows);
}
