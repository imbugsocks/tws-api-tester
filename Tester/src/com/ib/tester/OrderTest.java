package com.ib.tester;

import com.ib.client.*;

public class OrderTest extends TesterTemplate {

	@Override
	public void runTest() {
		// TODO Auto-generated method stub
		m_socket.eConnect("", 7496, 0);
		
		//wait a sec...
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Contract c = new Contract();
		c.m_conId = 8314; //IBM
		c.m_exchange = "SMART";
		
		Order o = new Order();
		o.m_action = "BUY";
		o.m_tif = "GTC";
		o.m_orderType = "LMT";
		o.m_lmtPrice = 1;
		o.m_totalQuantity = 100;
		
		m_socket.placeOrder(m_orderId++, c, o);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m_socket.eDisconnect(); 
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OrderTest().runTest();
	}

}
