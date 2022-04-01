package com.uni.cart.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.uni.cart.model.service.CartService;
import com.uni.cart.model.vo.Cart;
import com.uni.member.model.vo.Member;

/**
 * Servlet implementation class CartListDataServlet
 */
@WebServlet("/cartListData.do")
public class CartListDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartListDataServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Member user = ((Member)request.getSession().getAttribute("loginUser"));
		//System.out.println(user);
		//if(!user.equals("null")) {
		
			//System.out.println("여기가 찍히나?");
			String writer = String.valueOf(((Member)request.getSession().getAttribute("loginUser")).getUserNo());
			//System.out.println(writer);
			//System.out.println("Servlet writer : " + writer);
			ArrayList<Cart> list = new CartService().CartList(writer);
			
			request.setAttribute("list", list);
			
			
			response.setContentType("application/json; charset=utf-8"); 
		
			new Gson().toJson(list, response.getWriter());
			//System.out.println("list : " + list);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
