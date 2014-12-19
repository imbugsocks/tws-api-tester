package com.ib.tester;

import com.ib.client.*;

public abstract class TesterTemplate implements EWrapper {
	
	protected EClientSocket m_socket = new EClientSocket(this);
	protected int m_orderId;
	protected int m_reqId;
	
	public abstract void runTest();
	
	@Override
	public void error(Exception e) {
		System.out.println(EWrapperMsgGenerator.error(e)); 
	}

	@Override
	public void error(String str) {
		System.out.println(EWrapperMsgGenerator.error(str));
	}

	@Override
	public void error(int id, int errorCode, String errorMsg) {
		System.out.println(EWrapperMsgGenerator.error(id, errorCode, errorMsg));
	}

	@Override
	public void connectionClosed() {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.connectionClosed());
	}

	@Override
	public void tickPrice(int tickerId, int field, double price,
			int canAutoExecute) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.tickPrice(tickerId, field, price, canAutoExecute));
	}

	@Override
	public void tickSize(int tickerId, int field, int size) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.tickSize(tickerId, field, size));
	}

	@Override
	public void tickOptionComputation(int tickerId, int field,
			double impliedVol, double delta, double optPrice,
			double pvDividend, double gamma, double vega, double theta,
			double undPrice) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.tickOptionComputation(tickerId, field, impliedVol, delta, optPrice, pvDividend, gamma, vega, theta, undPrice));
	}

	@Override
	public void tickGeneric(int tickerId, int tickType, double value) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.tickGeneric(tickerId, tickType, value));
	}

	@Override
	public void tickString(int tickerId, int tickType, String value) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.tickString(tickerId, tickType, value));
	}

	@Override
	public void tickEFP(int tickerId, int tickType, double basisPoints,
			String formattedBasisPoints, double impliedFuture, int holdDays,
			String futureExpiry, double dividendImpact, double dividendsToExpiry) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.tickEFP(tickerId, tickType, basisPoints, formattedBasisPoints, impliedFuture, holdDays, futureExpiry, dividendImpact, dividendsToExpiry));
	}

	@Override
	public void orderStatus(int orderId, String status, int filled,
			int remaining, double avgFillPrice, int permId, int parentId,
			double lastFillPrice, int clientId, String whyHeld) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.orderStatus(orderId, status, filled, remaining, avgFillPrice, permId, parentId, lastFillPrice, clientId, whyHeld));
	}

	@Override
	public void openOrder(int orderId, Contract contract, Order order,
			OrderState orderState) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.openOrder(orderId, contract, order, orderState));
	}

	@Override
	public void openOrderEnd() {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.openOrderEnd());
	}

	@Override
	public void updateAccountValue(String key, String value, String currency,
			String accountName) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.updateAccountValue(key, value, currency, accountName));
	}

	@Override
	public void updatePortfolio(Contract contract, int position,
			double marketPrice, double marketValue, double averageCost,
			double unrealizedPNL, double realizedPNL, String accountName) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.updatePortfolio(contract, position, marketPrice, marketValue, averageCost, unrealizedPNL, realizedPNL, accountName));
	}

	@Override
	public void updateAccountTime(String timeStamp) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.updateAccountTime(timeStamp));
	}

	@Override
	public void accountDownloadEnd(String accountName) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.accountDownloadEnd(accountName));
	}

	@Override
	public void nextValidId(int orderId) {
		// TODO Auto-generated method stub
		m_orderId = orderId;
		m_reqId = m_orderId + 1000;
		System.out.println(EWrapperMsgGenerator.nextValidId(orderId));
	}

	@Override
	public void contractDetails(int reqId, ContractDetails contractDetails) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.contractDetails(reqId, contractDetails));
	}

	@Override
	public void bondContractDetails(int reqId, ContractDetails contractDetails) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.bondContractDetails(reqId, contractDetails));
	}

	@Override
	public void contractDetailsEnd(int reqId) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.contractDetailsEnd(reqId));
	}

	@Override
	public void execDetails(int reqId, Contract contract, Execution execution) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.execDetails(reqId, contract, execution));
	}

	@Override
	public void execDetailsEnd(int reqId) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.execDetailsEnd(reqId));
	}

	@Override
	public void updateMktDepth(int tickerId, int position, int operation,
			int side, double price, int size) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.updateMktDepth(tickerId, position, operation, side, price, size));
	}

	@Override
	public void updateMktDepthL2(int tickerId, int position,
			String marketMaker, int operation, int side, double price, int size) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.updateMktDepthL2(tickerId, position, marketMaker, operation, side, price, size));
	}

	@Override
	public void updateNewsBulletin(int msgId, int msgType, String message,
			String origExchange) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.updateNewsBulletin(msgId, msgType, message, origExchange));
	}

	@Override
	public void managedAccounts(String accountsList) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.managedAccounts(accountsList));
	}

	@Override
	public void receiveFA(int faDataType, String xml) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.receiveFA(faDataType, xml));
	}

	@Override
	public void historicalData(int reqId, String date, double open,
			double high, double low, double close, int volume, int count,
			double WAP, boolean hasGaps) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.historicalData(reqId, date, open, high, low, close, volume, count, WAP, hasGaps));
	}

	@Override
	public void scannerParameters(String xml) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.scannerParameters(xml));
	}

	@Override
	public void scannerData(int reqId, int rank,
			ContractDetails contractDetails, String distance, String benchmark,
			String projection, String legsStr) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.scannerData(reqId, rank, contractDetails, distance, benchmark, projection, legsStr));
	}

	@Override
	public void scannerDataEnd(int reqId) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.scannerDataEnd(reqId));
	}

	@Override
	public void realtimeBar(int reqId, long time, double open, double high,
			double low, double close, long volume, double wap, int count) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.realtimeBar(reqId, time, open, high, low, close, volume, wap, count));
	}

	@Override
	public void currentTime(long time) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.currentTime(time));
	}

	@Override
	public void fundamentalData(int reqId, String data) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.fundamentalData(reqId, data));
	}

	@Override
	public void deltaNeutralValidation(int reqId, UnderComp underComp) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.deltaNeutralValidation(reqId, underComp));
	}

	@Override
	public void tickSnapshotEnd(int reqId) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.tickSnapshotEnd(reqId));
	}

	@Override
	public void marketDataType(int reqId, int marketDataType) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.marketDataType(reqId, marketDataType));
	}

	@Override
	public void commissionReport(CommissionReport commissionReport) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.commissionReport(commissionReport));
	}

	@Override
	public void position(String account, Contract contract, int pos,
			double avgCost) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.position(account, contract, pos, avgCost));
	}

	@Override
	public void positionEnd() {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.positionEnd());
	}

	@Override
	public void accountSummary(int reqId, String account, String tag,
			String value, String currency) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.accountSummary(reqId, account, tag, value, currency));
	}

	@Override
	public void accountSummaryEnd(int reqId) {
		// TODO Auto-generated method stub
		System.out.println(EWrapperMsgGenerator.accountSummaryEnd(reqId));
	}
	
}
