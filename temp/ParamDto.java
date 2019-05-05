package cn.ways.services.mis004.utils.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import cn.ways.common.utils.bean.ParentParamDto;
import cn.ways.services.mis004.provider.vo.DifMonsVal;

/**
 * RESTful接口入参
 */
public class ParamDto extends ParentParamDto implements Cloneable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 189815582506906546L;
	
	SimpleDateFormat bsdf=new SimpleDateFormat("yyyy-M");
	SimpleDateFormat asdf=new SimpleDateFormat("yyyyMM");
	
	private Integer isQuarter;  //1:季度平均数据 2:月度数据
	private Integer algType; //算法类型
	private Integer orgId;
	private List<Integer> subModelIdList;
	private String authSegSubModelIds;
	private int salesDifVal;
	private int salesDifSign;
	private String salesYms;
	private String salesMaxYm;
	private String salesQuarterStartYm;
	private String salesQuarterEndYm;
	private String salesMonthVal;
	private int getMaxSaleYmSign;
	private List<DifMonsVal> salesDifList;
	private int tpDifVal;
	private int tpDifSign;
	private int tpFourthWeekDifSign;
	private int tpFourthWeekDifMonths;
	private int tpFourthWeekDifQuarters;
	private String tpYms;
	private String tpStartYm;
	private String tpEndYm;
	private String tpMonthsSign;
	private String maxTpYm;
	private List<DifMonsVal> tpDifList;
	private List<DifMonsVal> tpDifList2;
	private int msrpDifVal;
	private int msrpDifSign;
	private String msrpYms;
	private String msrpStartYm;
	private String msrpEndYm;
	private String msrpMonthsSign;
	private String maxMsrpYm;
	private List<DifMonsVal> msrpDifList;
	private List<DifMonsVal> msrpDifList2;
	private int mixDifVal;
	private int mixDifSign;
	private String mixYms;
	private String mixStartYm;
	private String mixEndYm;
	private String mixMonthsSign;
	private List<DifMonsVal> mixDifList;
	private List<DifMonsVal> mixDifList2;
	private int startRowNum;
	private int endRowNum;
	private String msrpTitleYm;
	private String tpTitleYm;
	
	private String showType;
	//起始时间
	private String start;
	//结束时间
	private String end;
	//子车型
	private List<String> subModelIds;
	//奖励类型
	private List<String> rewardTypeIds;
	
	//高级查询  城市
	private List<String> advanceds;
	
	private String timeSql;
	
	private String subModelName;
	
	/**
	 * 通行令牌
	 */
	private String token;

	/**
	 * 年月
	 */
	private String maxYm;
	private String minYm;
	private String ym;
	private String ym1;
	private String ym2;
	private String yms;
	private String year;
	private String year1;
	private String yearOrMonth;
	private String buyCarId;
	private String buyCarIdB;
	/**
	 * 1子车型   2型号  3品牌  4生产商品牌
	 */
	private String carIdType;
	
	private String carType;
	
	/**
	 * '固定折扣', '考核奖励','月度激励'
	 */
	private String ways_sort;
	
	/**
	 * 1  三个时间点   2连续的时间段   3单时间点   4两个时间点
	 */
	private String timeType;
	
	/**
	 * 环比年月
	 */
	private String momYm;
	
	/**
	 * 同比年月
	 */
	private String yoyYm;
	
	/**
	 * 数据源
	 */
	private String dataSource;
	
	/**
	 * 金额/比例
	 */
	private String moneyOrRatio;
	
	/**
	 * 子车型 id 串
	 */
	private String subModelIdss;
	
	/**
	 * 品牌 id 串
	 */
	private String brandIds;
	
	/**
	 * 默认品牌
	 */
	private int defaultBrand;
	
	/**
	 * 默认生产商品牌
	 */
	private int defaultManfBrand;
	
	/**
	 * 返回的数据类型：sub车型数据  manf生产商品牌  sum第一行的汇总数据
	 */
	private String dataType;
	
	private String ids;
	
	private List<String> idsList;
	
	/**
	 * 1我关注的生产商品牌  2我的车型  3我关注的车型
	 */
	private String type;
	
	/**
	 * 是否计算加权msrp ： 1是  0否
	 */
	private String msrpMix;
	
	/**
	 * 是否计算折扣：1是   0否
	 */
	private String discount;
	
	/**
	 * 1我的车型  2我关注的车型  3生产商品牌
	 */
	private String mySubOrMyAttention;
	
	/**
	 * 参与价格计算的城市id
	 */
	private String cityIds;
	
	/**
	 * 是否需要子车型图片： 1是  2否
	 */
	private String isImage;
	
	/**
	 * 细分市场下的子车型id串
	 */
	private String segSubIds;
	
	/**
	 * 细分市场： 1一级  2二级
	 */
	private String segment;
	
	/**
	 * 细分市场名称
	 */
	private String segName;
	
	/**
	 * 竞品子车型id
	 */
	private String vsIds;
	
	/**
	 * 本品子车型id
	 */
	private String myIds;
	
	private String isCheckAll;
	
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		if(StringUtils.isNotBlank(start)){
			try {
				start=asdf.format(bsdf.parse(start));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			start=null;
		}
		this.start = start;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getYm() {
		return ym;
	}
	public void setYm(String ym) {
		this.ym = ym;
	}
	public String getYm1() {
		return ym1;
	}
	public void setYm1(String ym1) {
		this.ym1 = ym1;
	}
	public String getYm2() {
		return ym2;
	}
	public void setYm2(String ym2) {
		this.ym2 = ym2;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getYear1() {
		return year1;
	}
	public void setYear1(String year1) {
		this.year1 = year1;
	}
	public String getYearOrMonth() {
		return yearOrMonth;
	}
	public void setYearOrMonth(String yearOrMonth) {
		this.yearOrMonth = yearOrMonth;
	}
	public String getBuyCarId() {
		return buyCarId;
	}
	public void setBuyCarId(String buyCarId) {
		this.buyCarId = buyCarId;
	}
	public String getCarIdType() {
		return carIdType;
	}
	public void setCarIdType(String carIdType) {
		this.carIdType = carIdType;
	}
	public String getWays_sort() {
		return ways_sort;
	}
	public void setWays_sort(String ways_sort) {
		this.ways_sort = ways_sort;
	}
	public String getTimeType() {
		return timeType;
	}
	public void setTimeType(String timeType) {
		this.timeType = timeType;
	}
	public String getMomYm() {
		return momYm;
	}
	public void setMomYm(String momYm) {
		this.momYm = momYm;
	}
	public String getYoyYm() {
		return yoyYm;
	}
	public void setYoyYm(String yoyYm) {
		this.yoyYm = yoyYm;
	}
	public String getDataSource() {
		return dataSource;
	}
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}
	public String getMoneyOrRatio() {
		return moneyOrRatio;
	}
	public void setMoneyOrRatio(String moneyOrRatio) {
		this.moneyOrRatio = moneyOrRatio;
	}
	public String getSubModelIdss() {
		return subModelIdss;
	}
	public void setSubModelIdss(String subModelIdss) {
		this.subModelIdss = subModelIdss;
	}
	public String getBrandIds() {
		return brandIds;
	}
	public void setBrandIds(String brandIds) {
		this.brandIds = brandIds;
	}
	public int getDefaultBrand() {
		return defaultBrand;
	}
	public void setDefaultBrand(int defaultBrand) {
		this.defaultBrand = defaultBrand;
	}
	public int getDefaultManfBrand() {
		return defaultManfBrand;
	}
	public void setDefaultManfBrand(int defaultManfBrand) {
		this.defaultManfBrand = defaultManfBrand;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public String getIds() {
		return ids;
	}
	public void setIds(String ids) {
		this.ids = ids;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMsrpMix() {
		return msrpMix;
	}
	public void setMsrpMix(String msrpMix) {
		this.msrpMix = msrpMix;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getMySubOrMyAttention() {
		return mySubOrMyAttention;
	}
	public void setMySubOrMyAttention(String mySubOrMyAttention) {
		this.mySubOrMyAttention = mySubOrMyAttention;
	}
	public String getCityIds() {
		return cityIds;
	}
	public void setCityIds(String cityIds) {
		this.cityIds = cityIds;
	}
	public String getIsImage() {
		return isImage;
	}
	public void setIsImage(String isImage) {
		this.isImage = isImage;
	}
	public String getSegSubIds() {
		return segSubIds;
	}
	public void setSegSubIds(String segSubIds) {
		this.segSubIds = segSubIds;
	}
	public String getSegment() {
		return segment;
	}
	public void setSegment(String segment) {
		this.segment = segment;
	}
	public String getSegName() {
		return segName;
	}
	public void setSegName(String segName) {
		this.segName = segName;
	}
	public String getVsIds() {
		return vsIds;
	}
	public void setVsIds(String vsIds) {
		this.vsIds = vsIds;
	}
	public String getMyIds() {
		return myIds;
	}
	public void setMyIds(String myIds) {
		this.myIds = myIds;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		if(StringUtils.isNotBlank(end)){
			try {
				end=asdf.format(bsdf.parse(end));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			end=null;
		}
		this.end = end;
	}
	public List<String> getSubModelIds() {
		return subModelIds;
	}
	public void setSubModelIds(List<String> subModelIds) {
		this.subModelIds = subModelIds;
	}
	public List<String> getRewardTypeIds() {
		return rewardTypeIds;
	}
	public void setRewardTypeIds(List<String> rewardTypeIds) {
		this.rewardTypeIds = rewardTypeIds;
	}
	public List<String> getAdvanceds() {
		return advanceds;
	}
	public void setAdvanceds(List<String> advanceds) {
		this.advanceds = advanceds;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public String getTimeSql() {
		return timeSql;
	}
	public void setTimeSql(String timeSql) {
		this.timeSql = timeSql;
	}
	public String getMaxYm() {
		return maxYm;
	}
	public void setMaxYm(String maxYm) {
		this.maxYm = maxYm;
	}
	public String getMinYm() {
		return minYm;
	}
	public void setMinYm(String minYm) {
		this.minYm = minYm;
	}
	public List<String> getIdsList() {
		return idsList;
	}
	public void setIdsList(List<String> idsList) {
		this.idsList = idsList;
	}
	public String getSubModelName() {
		return subModelName;
	}
	public void setSubModelName(String subModelName) {
		this.subModelName = subModelName;
	}
	public String getBuyCarIdB() {
		return buyCarIdB;
	}
	public void setBuyCarIdB(String buyCarIdB) {
		this.buyCarIdB = buyCarIdB;
	}
	public String getIsCheckAll() {
		return isCheckAll;
	}
	public void setIsCheckAll(String isCheckAll) {
		this.isCheckAll = isCheckAll;
	}
	public int getTpDifVal() {
		return tpDifVal;
	}
	public void setTpDifVal(int tpDifVal) {
		this.tpDifVal = tpDifVal;
	}
	public int getMsrpDifVal() {
		return msrpDifVal;
	}
	public void setMsrpDifVal(int msrpDifVal) {
		this.msrpDifVal = msrpDifVal;
	}
	public int getMixDifVal() {
		return mixDifVal;
	}
	public void setMixDifVal(int mixDifVal) {
		this.mixDifVal = mixDifVal;
	}
	public int getTpDifSign() {
		return tpDifSign;
	}
	public void setTpDifSign(int tpDifSign) {
		this.tpDifSign = tpDifSign;
	}
	public int getMsrpDifSign() {
		return msrpDifSign;
	}
	public void setMsrpDifSign(int msrpDifSign) {
		this.msrpDifSign = msrpDifSign;
	}
	public int getMixDifSign() {
		return mixDifSign;
	}
	public void setMixDifSign(int mixDifSign) {
		this.mixDifSign = mixDifSign;
	}
	public List<DifMonsVal> getTpDifList() {
		return tpDifList;
	}
	public void setTpDifList(List<DifMonsVal> tpDifList) {
		this.tpDifList = tpDifList;
	}
	public List<DifMonsVal> getMsrpDifList() {
		return msrpDifList;
	}
	public void setMsrpDifList(List<DifMonsVal> msrpDifList) {
		this.msrpDifList = msrpDifList;
	}
	public List<DifMonsVal> getMixDifList() {
		return mixDifList;
	}
	public void setMixDifList(List<DifMonsVal> mixDifList) {
		this.mixDifList = mixDifList;
	}
	public String getTpYms() {
		return tpYms;
	}
	public void setTpYms(String tpYms) {
		this.tpYms = tpYms;
	}
	public String getMsrpYms() {
		return msrpYms;
	}
	public void setMsrpYms(String msrpYms) {
		this.msrpYms = msrpYms;
	}
	public String getMixYms() {
		return mixYms;
	}
	public void setMixYms(String mixYms) {
		this.mixYms = mixYms;
	}
	public int getSalesDifVal() {
		return salesDifVal;
	}
	public void setSalesDifVal(int salesDifVal) {
		this.salesDifVal = salesDifVal;
	}
	public int getSalesDifSign() {
		return salesDifSign;
	}
	public void setSalesDifSign(int salesDifSign) {
		this.salesDifSign = salesDifSign;
	}
	public String getSalesYms() {
		return salesYms;
	}
	public void setSalesYms(String salesYms) {
		this.salesYms = salesYms;
	}
	public List<DifMonsVal> getSalesDifList() {
		return salesDifList;
	}
	public void setSalesDifList(List<DifMonsVal> salesDifList) {
		this.salesDifList = salesDifList;
	}
	public String getSalesMaxYm() {
		return salesMaxYm;
	}
	public void setSalesMaxYm(String salesMaxYm) {
		this.salesMaxYm = salesMaxYm;
	}
	public String getSalesMonthVal() {
		return salesMonthVal;
	}
	public void setSalesMonthVal(String salesMonthVal) {
		this.salesMonthVal = salesMonthVal;
	}
	
	public String getMsrpStartYm() {
		return msrpStartYm;
	}
	public void setMsrpStartYm(String msrpStartYm) {
		this.msrpStartYm = msrpStartYm;
	}
	public String getMsrpEndYm() {
		return msrpEndYm;
	}
	public void setMsrpEndYm(String msrpEndYm) {
		this.msrpEndYm = msrpEndYm;
	}
	public String getTpStartYm() {
		return tpStartYm;
	}
	public void setTpStartYm(String tpStartYm) {
		this.tpStartYm = tpStartYm;
	}
	public String getTpEndYm() {
		return tpEndYm;
	}
	public void setTpEndYm(String tpEndYm) {
		this.tpEndYm = tpEndYm;
	}
	public String getMixStartYm() {
		return mixStartYm;
	}
	public void setMixStartYm(String mixStartYm) {
		this.mixStartYm = mixStartYm;
	}
	public String getMixEndYm() {
		return mixEndYm;
	}
	public void setMixEndYm(String mixEndYm) {
		this.mixEndYm = mixEndYm;
	}
	
	public List<DifMonsVal> getTpDifList2() {
		return tpDifList2;
	}
	public void setTpDifList2(List<DifMonsVal> tpDifList2) {
		this.tpDifList2 = tpDifList2;
	}
	public List<DifMonsVal> getMsrpDifList2() {
		return msrpDifList2;
	}
	public void setMsrpDifList2(List<DifMonsVal> msrpDifList2) {
		this.msrpDifList2 = msrpDifList2;
	}
	public List<DifMonsVal> getMixDifList2() {
		return mixDifList2;
	}
	public void setMixDifList2(List<DifMonsVal> mixDifList2) {
		this.mixDifList2 = mixDifList2;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		ParamDto p = (ParamDto) super.clone();
		return p;
	}
	public String getTpMonthsSign() {
		return tpMonthsSign;
	}
	public void setTpMonthsSign(String tpMonthsSign) {
		this.tpMonthsSign = tpMonthsSign;
	}
	public String getMsrpMonthsSign() {
		return msrpMonthsSign;
	}
	public void setMsrpMonthsSign(String msrpMonthsSign) {
		this.msrpMonthsSign = msrpMonthsSign;
	}
	public String getMixMonthsSign() {
		return mixMonthsSign;
	}
	public void setMixMonthsSign(String mixMonthsSign) {
		this.mixMonthsSign = mixMonthsSign;
	}
	public Integer getOrgId() {
		return orgId;
	}
	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}
	public List<Integer> getSubModelIdList() {
		return subModelIdList;
	}
	public void setSubModelIdList(List<Integer> subModelIdList) {
		this.subModelIdList = subModelIdList;
	}
	public String getAuthSegSubModelIds() {
		return authSegSubModelIds;
	}
	public void setAuthSegSubModelIds(String authSegSubModelIds) {
		this.authSegSubModelIds = authSegSubModelIds;
	}
	public String getShowType() {
		return showType;
	}
	public void setShowType(String showType) {
		this.showType = showType;
	}
	public int getGetMaxSaleYmSign() {
		return getMaxSaleYmSign;
	}
	public void setGetMaxSaleYmSign(int getMaxSaleYmSign) {
		this.getMaxSaleYmSign = getMaxSaleYmSign;
	}
	public int getStartRowNum() {
		return startRowNum;
	}
	public void setStartRowNum(int startRowNum) {
		this.startRowNum = startRowNum;
	}
	public int getEndRowNum() {
		return endRowNum;
	}
	public void setEndRowNum(int endRowNum) {
		this.endRowNum = endRowNum;
	}
	public Integer getAlgType() {
		return algType;
	}
	public void setAlgType(Integer algType) {
		this.algType = algType;
	}
	public int getTpFourthWeekDifSign() {
		return tpFourthWeekDifSign;
	}
	public void setTpFourthWeekDifSign(int tpFourthWeekDifSign) {
		this.tpFourthWeekDifSign = tpFourthWeekDifSign;
	}
	public int getTpFourthWeekDifMonths() {
		return tpFourthWeekDifMonths;
	}
	public void setTpFourthWeekDifMonths(int tpFourthWeekDifMonths) {
		this.tpFourthWeekDifMonths = tpFourthWeekDifMonths;
	}
	public String getMaxTpYm() {
		return maxTpYm;
	}
	public void setMaxTpYm(String maxTpYm) {
		this.maxTpYm = maxTpYm;
	}
	public String getMaxMsrpYm() {
		return maxMsrpYm;
	}
	public void setMaxMsrpYm(String maxMsrpYm) {
		this.maxMsrpYm = maxMsrpYm;
	}
	public String getMsrpTitleYm() {
		return msrpTitleYm;
	}
	public void setMsrpTitleYm(String msrpTitleYm) {
		this.msrpTitleYm = msrpTitleYm;
	}
	public String getTpTitleYm() {
		return tpTitleYm;
	}
	public void setTpTitleYm(String tpTitleYm) {
		this.tpTitleYm = tpTitleYm;
	}
	public Integer getIsQuarter() {
		return isQuarter;
	}
	public void setIsQuarter(Integer isQuarter) {
		this.isQuarter = isQuarter;
	}
	public String getSalesQuarterStartYm() {
		return salesQuarterStartYm;
	}
	public void setSalesQuarterStartYm(String salesQuarterStartYm) {
		this.salesQuarterStartYm = salesQuarterStartYm;
	}
	public String getSalesQuarterEndYm() {
		return salesQuarterEndYm;
	}
	public void setSalesQuarterEndYm(String salesQuarterEndYm) {
		this.salesQuarterEndYm = salesQuarterEndYm;
	}
	public String getYms() {
		return yms;
	}
	public void setYms(String yms) {
		this.yms = yms;
	}
	public int getTpFourthWeekDifQuarters() {
		return tpFourthWeekDifQuarters;
	}
	public void setTpFourthWeekDifQuarters(int tpFourthWeekDifQuarters) {
		this.tpFourthWeekDifQuarters = tpFourthWeekDifQuarters;
	}
	
	
}
