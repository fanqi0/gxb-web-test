package com.kkb.test.pages.pc.gxb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kkb.test.pages.Page;

/**
 * @author sh.deng
 * @description 高校帮 首页 page
 * @date 2015.09.14
 */
public class IndexPage extends Page {

	public IndexPage(WebDriver webDriver) {
		super(webDriver);
	}

	@FindBy(linkText = "首页")
	public WebElement mianPage;

	@FindBy(linkText = "课程")
	public WebElement course;

	@FindBy(linkText = "个人中心")
	public WebElement personCenter;

	@FindBy(linkText = "管理员入口")
	public WebElement adminLogin;

	@FindBy(linkText = "登录/注册")
	public WebElement tologinBtn;

	@FindBy(id = "username")
	public WebElement username;

	@FindBy(id = "password")
	public WebElement password;

	/**
	 * 登陆按钮
	 */
	@FindBy(id = "login-submit")
	public WebElement loginBtn;

	/**
	 * 用户信息 用于判断是否登录
	 */
	@FindBy(xpath = "//div[@id='userInfo']/a")
	public WebElement loginInfo;

}
