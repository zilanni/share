package cn.ways.services.mis004.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.ways.common.aspect.auth.UserInfo;
import cn.ways.services.mis004.provider.vo.DifMonsVal;
import cn.ways.services.mis004.provider.vo.ExcitationTime;
import cn.ways.services.mis004.provider.vo.ProfitStructure;
import cn.ways.services.mis004.provider.vo.SegSubExcitation;
import cn.ways.services.mis004.provider.vo.SubModel;
import cn.ways.services.mis004.provider.vo.SubModelReward;
import cn.ways.services.mis004.provider.vo.TerminalAnalyze;
import cn.ways.services.mis004.utils.bean.ParamDto;

@Repository
@Mapper
public interface TerminalStimulateMapper {
	
	/**
	 * describe: 单车型终端激励分析,获取 销量/(同比(年头-当前月)，环比(当前月)) 年度固定折扣/环比(当前月) 年度考核奖励/环比(当前月) 月度激励/环比(当前月) 利润/环比(当前月)
	 * @authod liuyuhuan
	 * @date 2018年8月17日 下午5:07:24
	 */
	List<TerminalAnalyze> getSingleModelTerminalAnalyzeData(@Param(value="dto")ParamDto dto,@Param(value = "userInfo")UserInfo userInfo);

	/**
	 * describe: 车型终端支持分析-我的车型/我关注的车型
	 * @authod liuyuhuan
	 * @date 2018年8月8日 下午3:32:03
	 */
	List<TerminalAnalyze> getTerminalAnalyzeData(@Param(value = "dto")ParamDto dto, @Param(value = "userInfo")UserInfo userInfo);

	/**
	 * describe: 车型终端支持分析-车型列表数据
	 * @authod liuyuhuan
	 * @date 2018年8月13日 下午2:33:56
	 */
	List<TerminalAnalyze> getTerminalAnalyzeTableData(@Param(value = "dto")ParamDto dto, @Param(value = "userInfo")UserInfo userInfo);


	/**
	 * describe: 单车型终端激励分析,获取 细分市场 销量/(同比(年头-当前月)，环比(当前月)) 年度固定折扣/环比(当前月) 年度考核奖励/环比(当前月) 月度激励/环比(当前月) 利润/环比(当前月)
	 * @authod liuyuhuan
	 * @date 2018年8月20日 下午3:57:32
	 */
	TerminalAnalyze getSingleModelTerminalAnalyzeSegData(@Param(value = "dto")ParamDto dto,@Param(value = "userInfo")UserInfo userInfo);

	/**
	 * 获取账号下品牌的全部子车型id，如果存在多个品牌，则获取销量最高的品牌下的全部子车型id 
	 * describe: 
	 * @authod liuyuhuan
	 * @date 2018年8月22日 下午4:03:05
	 */
	List<String> getHighestSalesSubModelIds(@Param(value = "dto")ParamDto dto, @Param(value = "userInfo")UserInfo userInfo);

	/**
	 * describe: 获取某个子车型一年内的 固定折扣、考核奖励、月度激励
	 * @authod liuyuhuan
	 * @date 2018年8月23日 下午2:35:40
	 */
	List<TerminalAnalyze> getAllExcitationAnalyze(@Param(value = "dto")ParamDto dto, @Param(value = "userInfo")UserInfo userInfo);

	/**
	 * describe: 获取本品及竞品的 固定折扣、考核奖励
	 * @authod liuyuhuan
	 * @date 2018年8月24日 下午3:04:51
	 */
	List<TerminalAnalyze> getYearExcitationAnalyze(@Param(value = "dto")ParamDto dto, @Param(value = "userInfo")UserInfo userInfo);

	/**
	 * describe: 单车型终端激励分析 - 型号-选择型号
	 * @authod liuyuhuan
	 * @date 2018年8月24日 下午4:23:12
	 */
	List<SubModel> getSubModelAndVersion(@Param(value = "dto")ParamDto dto, @Param(value = "userInfo")UserInfo userInfo);

	/**
	 * describe: 单车型终端激励分析 - 年度激励(车型)
	 * @authod liuyuhuan
	 * @date 2018年8月27日 下午12:04:08
	 */
	List<SegSubExcitation> getYearExcitation(@Param(value = "dto")ParamDto dto, @Param(value = "userInfo")UserInfo userInfo);

	/**
	 * describe: 单车型终端激励分析 - 年度激励(细分市场)
	 * @param userInfo 
	 * @authod liuyuhuan
	 * @date 2018年8月27日 下午12:04:08
	 */
	List<SegSubExcitation> getYearSegExcitation(@Param(value = "dto")ParamDto dto, @Param(value = "userInfo")UserInfo userInfo);

	/**
	 * describe: 单车型终端激励分析 - 月度激励走势
	 * @authod liuyuhuan
	 * @date 2018年8月28日 上午10:03:45
	 */
	List<SegSubExcitation> getMonthExcitation(@Param(value = "dto")ParamDto dto, @Param(value = "userInfo")UserInfo userInfo);

	SegSubExcitation getSegMonthExcitation(@Param(value = "dto")ParamDto dto,@Param(value = "userInfo") UserInfo userInfo);

	List<SegSubExcitation> getProfitAnalyze(@Param(value = "dto")ParamDto dto, @Param(value = "userInfo")UserInfo userInfo);

	SegSubExcitation getSegProfitAnalyze(@Param(value = "dto")ParamDto dto, @Param(value = "userInfo")UserInfo userInfo);

	ProfitStructure getSegProfitStructure(@Param(value = "dto")ParamDto dto, @Param(value = "userInfo")UserInfo userInfo);

	List<ProfitStructure> getProfitStructure(@Param(value = "dto")ParamDto dto, @Param(value = "userInfo")UserInfo userInfo);

	List<SubModelReward> getSubReward(@Param(value = "dto")ParamDto dto, @Param(value = "userInfo")UserInfo userInfo);

	/**
	 * describe: 获取tp，msrp，mix 与 激励数据的时间差
	 * @authod liuyuhuan
	 * @date 2018年10月23日 上午11:15:59
	 */
	DifMonsVal getDifMonsVal(@Param(value = "dto")ParamDto dto,@Param(value = "userInfo")UserInfo userInfo);
	
	DifMonsVal getDifMonsVal2(@Param(value = "dto")ParamDto dto,@Param(value = "userInfo")UserInfo userInfo);

	/**
	 * describe: 获取分页的总条目数
	 * @authod liuyuhuan
	 * @date 2019年1月24日 下午2:29:22
	 */
	Integer getTerminalAnalyzeTableTotal(@Param(value = "dto")ParamDto dto, @Param(value = "userInfo")UserInfo userInfo);

	String getSegSubIds(@Param(value = "dto")ParamDto dto, @Param(value = "userInfo")UserInfo userInfo);

	Integer getSalesYm(@Param(value = "dto")ParamDto dto, @Param(value = "userInfo")UserInfo userInfo);

	String getSegNameBySubId(@Param(value = "dto")ParamDto dto, @Param(value = "userInfo")UserInfo userInfo);

	List<SubModel> getSubNameOrVerNameById(@Param(value = "dto")ParamDto dto, @Param(value = "userInfo")UserInfo userInfo);
}
