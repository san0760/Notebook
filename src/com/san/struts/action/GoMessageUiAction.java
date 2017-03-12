/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.san.struts.action;

import java.util.List;

import com.san.domain.Message;
import com.san.domain.Users;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.san.service.imp.MessageServiceImp;
import com.san.service.inter.MessageServiceInter;

/** 
 * MyEclipse Struts
 * Creation date: 03-02-2017
 * 
 * XDoclet definition:
 * @struts.action parameter="flag"
 */
public class GoMessageUiAction extends DispatchAction {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		//获取留言信息，并显示。
		//取出该用户收到的信息
		MessageServiceInter msi=new MessageServiceImp();
		Users user=(Users) request.getSession().getAttribute("user");
		List<Message> l=msi.showMessage(user);
		request.setAttribute("messageList", l);
		return mapping.findForward("goMessageUi");
	}
}