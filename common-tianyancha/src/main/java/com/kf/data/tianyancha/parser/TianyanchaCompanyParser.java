package com.kf.data.tianyancha.parser;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.kf.data.mybatis.entity.TycBaseCompanyCrawler;

/***
 * 
 * @Title: TianyanchaCompanyParser.java
 * @Package com.kf.data.tianyancha.parser
 * @Description: TODO(用一句话描述该文件做什么)
 * @author liangyt
 * @date 2017年9月29日 下午2:26:33
 * @version V1.0
 */
public class TianyanchaCompanyParser extends TianyanchaBasePaser {

	// <!-- 基本信息 -->
	// company-content
	// b-c-white new-border over-hide mr10
	public static final String loaderCssPath = "#_container_baseInfo > div > div > table > tbody";
	public static final String infoCssPath = "div.base0910";
	public static final String headerCssPath = "div.company_header_width";
	public static final String logoCssPath = ".new-border";

	public String paseNode(Document document, String operatingStatus, String companyID) {

		String companyName = null;
		try {
			TycBaseCompanyCrawler tycBaseCompanyCrawler = new TycBaseCompanyCrawler();
			tycBaseCompanyCrawler.setOperatingStatus(operatingStatus);
			Element headerElement = getNodeByCssPath(document, headerCssPath);
			/****
			 * toubu
			 */
			String address = null;
			String email = null;
			String tel = null;
			String website = null;

			if (headerElement == null) {
				System.out.println("头部没有");
			} else {
				Elements companyElements = headerElement.select(".f18.in-block.vertival-middle.sec-c2");
				if (companyElements.size() > 0) {
					companyName = companyElements.get(0).text();
					System.out.println("真实的名称是" + companyName);
					tycBaseCompanyCrawler.setCompanyName(companyName);
				}
				Elements inBlockElements = headerElement.select(".in-block.vertical-top:not(.sec-c3)");
				for (Element element : inBlockElements) {
					if (element.text().contains("地址：")) {
						address = element.text();
						address = address.replace("地址：", "").trim();
						address = address.replace("暂无", "").trim();
					} else if (element.text().contains("邮箱：")) {
						email = element.text();
						email = email.replace("邮箱：", "").trim();
						email = email.replace("暂无", "").trim();
					} else if (element.text().contains("网址：")) {
						website = element.text();
						website = website.replace("网址：", "");
						website = website.replace("暂无", "").trim();
					} else if (element.text().contains("电话：")) {
						tel = element.text();
						tel = tel.replace("电话：", "");
						tel = tel.replace("暂无", "").trim();
					}

				}
				String companyDetail = null;
				// sec-c2 over-hide
				Elements secElements = headerElement.select(".sec-c2.over-hide");
				if (secElements.size() > 0) {
					Elements scriptElements = secElements.first().select("#company_base_info_detail");
					if (scriptElements.size() > 0) {
						companyDetail = scriptElements.get(0).toString();
						companyDetail = StringUtils.substringBetween(companyDetail, "company_base_info_detail\">",
								"</script>");
					} else {
						companyDetail = secElements.first().text();
					}
					tycBaseCompanyCrawler.setCompanyAbout(companyDetail);
				}

			}
			/****
			 * end
			 */
			/****
			 * chuzi
			 */
			String legalRepresentative = null;
			String registeredCapital = null;
			String registrationDate = null;
			String registrationDateMachine = null;
			// Date dtSetupCorp = null;
			// String operatingStatus = null;
			Element loaderElement = getNodeByCssPath(document, loaderCssPath);
			if (loaderElement == null) {
				System.out.println("法人信息没有");
			} else {
				Elements loaderElements = loaderElement.select("tr");
				if (loaderElements.size() > 0) {
					Element element = loaderElements.get(0);

					Element legalRepresentativeElement = element.select("td").get(0);
					if (legalRepresentativeElement
							.select("div.human-top:nth-child(1) > div:nth-child(2) > div:nth-child(1)").size() > 0) {
						legalRepresentative = legalRepresentativeElement.select("a").first().text();
					} else {
						legalRepresentative = legalRepresentativeElement.text();
					}
					Element registeredCapitalElement = element.select("td").get(1);
					registeredCapital = registeredCapitalElement
							.select("div:nth-child(1) > div:nth-child(2) > div:nth-child(1)").text().trim();
					registrationDate = registeredCapitalElement
							.select("div:nth-child(2) > div:nth-child(2) > div:nth-child(1)").text().trim();
					registrationDate = registrationDate.replace("-", "");

				}

			}
			String approvedDate = null;
			String approvedDateMachine = null;
			String businessScope = null;
			String companyAbout = null;
			String companyLogoUrl = null;
			String companyProperty = null;
			String companyShortname = null;
			String companySize = null;
			String companyType = null;
			String companyUsetypeId = null;
			String companyUsetypeName = null;
			String companyUsetypeTable = null;
			String creditCode = null;
			String industry = null;
			String industryRecruitment = null;
			String legalRepresentativeId = null;
			String operatingBeginDate = null;
			String operatingEndDate = null;

			String organizationCode = null;
			String websiteRecruitment = null;

			String registeredAddress = null;
			String registeredCityCode = null;
			String registeredCityName = null;
			String registrationAuthority = null;

			String registrationNumber = null;
			Element infoElement = getNodeByCssPath(document, infoCssPath);
			if (infoElement == null) {
				System.out.println("主要信息没有");
			} else {
				Elements nodes = infoElement.select("tr");
				for (Element trElement : nodes) {
					try {
						Elements leftElements = trElement.select(".table-left");
						for (Element element : leftElements) {
							if (element.text().startsWith("工商注册号")) {
								registrationNumber = trElement.select("td").get(1).text().trim();
							} else if (element.text().startsWith("组织机构代码")) {
								organizationCode = trElement.select("td").get(3).text().trim();
							} else if (element.text().startsWith("统一信用代码")) {
								creditCode = trElement.select("td").get(1).text().trim();
							} else if (element.text().startsWith("企业类型")) {
								companyType = trElement.select("td").get(3).text().trim();
							} else if (element.text().startsWith("行业")) {
								industryRecruitment = trElement.select("td").get(3).text().trim();
							} else if (element.text().startsWith("营业期限")) {
								String operating = trElement.select("td").get(1).text().trim();
								String temp[] = operating.split("至");
								if (temp.length == 2) {
									operatingBeginDate = temp[0].trim().trim();
									operatingEndDate = temp[1].trim().trim();
								}
							} else if (element.text().startsWith("核准日期")) {
								approvedDate = trElement.select("td").get(3).text().trim();
								approvedDate = approvedDate.replace("-", "").trim().trim();
							} else if (element.text().startsWith("登记机关")) {
								registrationAuthority = trElement.select("td").get(1).text().trim();
							} else if (element.text().startsWith("注册地址")) {
								registeredAddress = trElement.select("td").get(3).text().trim();
							} else if (element.text().startsWith("经营范围")) {
								businessScope = trElement.select("td").get(1).text().trim();
								businessScope = businessScope.replace("收起", "").trim();
								businessScope = businessScope.replace("详细", "").trim();
							}

						}
					} catch (Exception e) {
						e.printStackTrace();
						continue;
					}

				}
			}

			tycBaseCompanyCrawler.setAddress(address);

			tycBaseCompanyCrawler.setApprovedDate(approvedDate);

			tycBaseCompanyCrawler.setApprovedDateMachine(approvedDateMachine);

			tycBaseCompanyCrawler.setBusinessScope(businessScope);

//			tycBaseCompanyCrawler.setCompanyAbout(companyAbout);
			tycBaseCompanyCrawler.setCompanyId(companyID);

			tycBaseCompanyCrawler.setCompanyLogoUrl(companyLogoUrl);
			tycBaseCompanyCrawler.setCompanyName(tycBaseCompanyCrawler.getCompanyName());

			tycBaseCompanyCrawler.setCompanyProperty(companyProperty);

			tycBaseCompanyCrawler.setCompanyShortname(tycBaseCompanyCrawler.getCompanyName());

			tycBaseCompanyCrawler.setCompanySize(companySize);

			tycBaseCompanyCrawler.setCompanyType(companyType);

			tycBaseCompanyCrawler.setCompanyUsetypeId(companyUsetypeId);

			tycBaseCompanyCrawler.setCompanyUsetypeName(companyUsetypeName);

			tycBaseCompanyCrawler.setCompanyUsetypeTable(companyUsetypeTable);
			tycBaseCompanyCrawler.setCreatedAt(new Date());

			tycBaseCompanyCrawler.setCreditCode(creditCode);

			tycBaseCompanyCrawler.setDtSetupCorp(null);

			tycBaseCompanyCrawler.setEmail(email);
			// tycBaseCompanyCrawler.setId();

			tycBaseCompanyCrawler.setIndustry(industry);

			tycBaseCompanyCrawler.setIndustryRecruitment(industryRecruitment);

			tycBaseCompanyCrawler.setLegalRepresentative(legalRepresentative);

			tycBaseCompanyCrawler.setLegalRepresentativeId(legalRepresentativeId);

			tycBaseCompanyCrawler.setOperatingBeginDate(operatingBeginDate);

			tycBaseCompanyCrawler.setOperatingEndDate(operatingEndDate);

			tycBaseCompanyCrawler.setOperatingStatus(operatingStatus);

			tycBaseCompanyCrawler.setOrganizationCode(organizationCode);

			tycBaseCompanyCrawler.setRegisteredAddress(registeredAddress);

			tycBaseCompanyCrawler.setRegisteredCapital(registeredCapital);

			tycBaseCompanyCrawler.setRegisteredCityCode(registeredCityCode);

			tycBaseCompanyCrawler.setRegisteredCityName(registeredCityName);

			tycBaseCompanyCrawler.setRegistrationAuthority(registrationAuthority);

			tycBaseCompanyCrawler.setRegistrationDate(registrationDate);

			tycBaseCompanyCrawler.setRegistrationDateMachine(registrationDateMachine);

			tycBaseCompanyCrawler.setRegistrationNumber(registrationNumber);
			tycBaseCompanyCrawler.setStatus(false);
			tycBaseCompanyCrawler.setTel(tel);
			tycBaseCompanyCrawler.setUpdatedAt(new Date());
			tycBaseCompanyCrawler.setWebsite(website);
			tycBaseCompanyCrawler.setWebsiteRecruitment(websiteRecruitment);
			sendJson(tycBaseCompanyCrawler, "tyc_base_company");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return companyName;

	}

}
