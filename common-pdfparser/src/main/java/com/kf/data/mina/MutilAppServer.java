package com.kf.data.mina;

import com.kf.data.fetcher.tools.KfConstant;
import com.kf.data.mina.server.TLSServer;

/****
 * 
 * @Title: MutilAppServer.java
 * @Package com.kf.data.mina
 * @Description: TODO(用一句话描述该文件做什么)
 * @author liangyt
 * @date 2017年10月12日 上午11:38:37
 * @version V1.0
 */
public class MutilAppServer {

	public static void main(String[] args) {
		KfConstant.init();
		new TLSServer();
	}
}
