/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.san.struts.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.san.domain.Message;
import com.san.domain.Users;
import com.san.service.imp.MessageServiceImp;
import com.san.service.imp.UserServiceImp;
import com.san.service.inter.MessageServiceInter;
import com.san.service.inter.UserServiceInter;
import com.san.struts.form.MessageForm;

/** 
 * MyEclipse Struts
 * Creation date: 03-09-2017
 * 
 * XDoclet definition:
 * @struts.action parameter="flag"
 */
public class GoPostMessageUiAction extends DispatchAction {
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
	public ActionForward goPostMessageUi(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return mapping.findForward("goPostMessage");
	}
	public ActionForward postMessage(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response){
		MessageForm mf=(MessageForm) form;
		Message m=new Message();
		m.setMain(mf.getMain());
		System.out.println(mf.getMain());
		UserServiceInter usit=new UserServiceImp();
		m.setTo(usit.getUsersByName(mf.getTo()));
		m.setMesTime(new Date());
		m.setFrom((Users)request.getSession().getAttribute("user"));
		MessageServiceInter msit=new MessageServiceImp();
		msit.save(m);
		return mapping.findForward("ok");
	}
}