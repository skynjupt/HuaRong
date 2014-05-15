package com.skyhonney.huarongroad.level;

import java.util.List;

import android.content.Context;

public class LevelMgr {
	private static final String HEIGHT_TAG = "height";
	private static final String WIDTH_TAG = "width";
	private static final String X_TAG = "x";
	private static final String Y_TAG = "y";
	private static final String PEPOLEDATA_TAG = "PepoleData";
	private static final String PEPOLE_TYPE_TAG = "pepoleType";

	public static void createPepoleComps(List<PepoleData> list, Context c) {

	}

	public static void genLevel(int level, Context c) {
		createPepoleComps(getLevel(level, c), c);
	}

	public static List<PepoleData> getLevel(int level, Context context) {

		List list = null;

		switch (level) {
		case LevelType.tao_zhi_yao_yao:
			list = parseXML("level/tao_zhi_yao_yao.xml", context);
			break;
		case LevelType.wu_heng_zhi_ju:
			list = parseXML("level/wu_heng_zhi_ju.xml", context);
			break;
		case LevelType.jiang_dang_hou_lu:
			list = parseXML("level/jiang_dang_hou_lu.xml", context);
			break;
		case LevelType.qian_hu_hou_yong:
			list = parseXML("level/qian_hu_hou_yong.xml", context);
			break;
		case LevelType.bi_yi_heng_kong:
			list = parseXML("level/bi_yi_heng_kong.xml", context);
			break;
		case LevelType.qiao_guo_wu_guan:
			list = parseXML("level/qiao_guo_wu_guan.xml", context);
			break;
		case LevelType.wu_jiang_bi_gong:
			list = parseXML("level/wu_jiang_bi_gong.xml", context);
			break;
		case LevelType.bing_lin_cao_ying:
			list = parseXML("level/bing_lin_cao_ying.xml", context);
			break;
		case LevelType.si_jiang_lian_guan:
			list = parseXML("level/si_jiang_lian_guan.xml", context);
			break;
		case LevelType.xin_jin_zai_zhi_chi:
			list = parseXML("level/xin_jin_zai_zhi_chi.xml", context);
			break;
		case LevelType.xing_luo_qi_bu:
			list = parseXML("level/xing_luo_qi_bu.xml", context);
			break;
		case LevelType.si_mian_ba_fang:
			list = parseXML("level/si_mian_ba_fang.xml", context);
			break;
		case LevelType.niu_qi_chong_tian:
			list = parseXML("level/niu_qi_chong_tian.xml", context);
			break;
		case LevelType.diao_bing_qian_jiang:
			list = parseXML("level/diao_bing_qian_jiang.xml", context);
			break;
		case LevelType.bei_shui_lie_zhen:
			list = parseXML("level/bei_shui_lie_zhen.xml", context);
			break;
		case LevelType.jie_jie_gao_shen:
			list = parseXML("level/jie_jie_gao_shen.xml", context);
			break;
		case LevelType.lun_hui:
			list = parseXML("level/lun_hui.xml", context);
			break;
		case LevelType.si_mian_chu_ge:
			list = parseXML("level/si_mian_chu_ge.xml", context);
			break;
		case LevelType.cha_chi_nan_fei:
			list = parseXML("level/cha_chi_nan_fei.xml", context);
			break;
		case LevelType.wu_shu_zhi_ju:
			list = parseXML("level/wu_shu_zhi_ju.xml", context);
			break;
		case LevelType.wei_er_bu_jian:
			list = parseXML("level/wei_er_bu_jian.xml", context);
			break;
		case LevelType.fang_jing_di_zhi_wa:
			list = parseXML("level/fang_jing_di_zhi_wa.xml", context);
			break;
		case LevelType.yi_lu_jin_jun:
			list = parseXML("level/yi_lu_jin_jun.xml", context);
			break;
		case LevelType.fa_ma:
			list = parseXML("level/fa_ma.xml", context);
			break;
		case LevelType.yi_fu_dang_guan:
			list = parseXML("level/yi_fu_dang_guan.xml", context);
			break;
		case LevelType.qi_tou_bing_jin:
			list = parseXML("level/qi_tou_bing_jin.xml", context);
			break;
		case LevelType.jing_di_zhi_wa:
			list = parseXML("level/jing_di_zhi_wa.xml", context);
			break;
		case LevelType.heng_dao_li_ma_3:
			list = parseXML("level/heng_dao_li_ma_3.xml", context);
			break;
		case LevelType.shu_tu_tong_gui_2:
			list = parseXML("level/shu_tu_tong_gui_2.xml", context);
			break;
		case LevelType.san_jun_lian_fang:
			list = parseXML("level/san_jun_lian_fang.xml", context);
			break;
		case LevelType.si_lu_jin_bing:
			list = parseXML("level/si_lu_jin_bing.xml", context);
			break;
		case LevelType.chong_chong_bao_wei:
			list = parseXML("level/chong_chong_bao_wei.xml", context);
			break;
		case LevelType.lie_dui_ying_jie:
			list = parseXML("level/lie_dui_ying_jie.xml", context);
			break;
		case LevelType.jiang_yong_cao_yin:
			list = parseXML("level/jiang_yong_cao_yin.xml", context);
			break;
		case LevelType.jiang_shou_jiao_lou:
			list = parseXML("level/jiang_shou_jiao_lou.xml", context);
			break;
		case LevelType.heng_dao_li_ma_2:
			list = parseXML("level/heng_dao_li_ma_2.xml", context);
			break;
		case LevelType.tao_hua_yuan_zhong:
			list = parseXML("level/tao_hua_yuan_zhong.xml", context);
			break;
		case LevelType.pi_ma_si_feng:
			list = parseXML("level/pi_ma_si_feng.xml", context);
			break;
		case LevelType.yi_ru_qi_tu:
			list = parseXML("level/yi_ru_qi_tu.xml", context);
			break;
		case LevelType.zuo_bing_you_jiang:
			list = parseXML("level/zuo_bing_you_jiang.xml", context);
			break;
		case LevelType.yun_zhe_wu_zhao:
			list = parseXML("level/yun_zhe_wu_zhao.xml", context);
			break;
		case LevelType.heng_shu_jie_jiang:
			list = parseXML("level/heng_shu_jie_jiang.xml", context);
			break;
		case LevelType.yi_di_tong_xin:
			list = parseXML("level/yi_di_tong_xin.xml", context);
			break;
		case LevelType.shu_tu_tong_gui:
			list = parseXML("level/shu_tu_tong_gui.xml", context);
			break;
		case LevelType.jia_dao_cang_bing:
			list = parseXML("level/jia_dao_cang_bing.xml", context);
			break;
		case LevelType.yu_qiao_yu_zhuo:
			list = parseXML("level/yu_qiao_yu_zhuo.xml", context);
			break;
		case LevelType.liu_jinag_shou_guan:
			list = parseXML("level/liu_jinag_shou_guan.xml", context);
			break;
		case LevelType.shou_kou_ru_ping_1:
			list = parseXML("level/shou_kou_ru_ping_1.xml", context);
			break;
		case LevelType.shui_xie_bu_tong:
			list = parseXML("level/shui_xie_bu_tong.xml", context);
			break;
		case LevelType.du_pi_xi_jing:
			list = parseXML("level/du_pi_xi_jing.xml", context);
			break;
		case LevelType.heng_dao_li_ma_1:
			list = parseXML("level/heng_dao_li_ma_1.xml", context);
			break;
		case LevelType.huan_li_wei_dui:
			list = parseXML("level/huan_li_wei_dui.xml", context);
			break;
		case LevelType.bing_dang_jiang_zu:
			list = parseXML("level/bing_dang_jiang_zu.xml", context);
			break;
		case LevelType.da_du_qiao_heng:
			list = parseXML("level/da_du_qiao_heng.xml", context);
			break;
		case LevelType.ru_di_wu_men:
			list = parseXML("level/ru_di_wu_men.xml", context);
			break;
		case LevelType.web_wang_ba_gua:
			list = parseXML("level/web_wang_ba_gua.xml", context);
			break;
		case LevelType.xing_bai_li_zhe:
			list = parseXML("level/xing_bai_li_zhe.xml", context);
			break;
		case LevelType.yu_ba_bu_neng:
			list = parseXML("level/yu_ba_bu_neng.xml", context);
			break;
		case LevelType.shou_kou_ru_ping_2:
			list = parseXML("level/shou_kou_ru_ping_2.xml", context);
			break;
		case LevelType.yang_96:
			list = parseXML("level/yang_96.xml", context);
			break;
		case LevelType.san_yang_kai_tai:
			list = parseXML("level/san_yang_kai_tai.xml", context);
			break;
		case LevelType.si_bing_tong_xin:
			list = parseXML("level/si_bing_tong_xin.xml", context);
			break;
		case LevelType.yin_96:
			list = parseXML("level/yin_96.xml", context);
			break;
		case LevelType.jin_zai_zhi_chi_2:
			list = parseXML("level/jin_zai_zhi_chi_2.xml", context);
			break;
		case LevelType.xiang_kan_liang_bu_yan:
			list = parseXML("level/xiang_kan_liang_bu_yan.xml", context);
			break;
		case LevelType.yu_you_chun_shui:
			list = parseXML("level/yu_you_chun_shui.xml", context);
			break;
		case LevelType.bai_bu_qi_xing:
			list = parseXML("level/bai_bu_qi_xing.xml", context);
			break;
		case LevelType.shen_xian_ling_yu:
			list = parseXML("level/shen_xian_ling_yu.xml", context);
			break;
		case LevelType.an_du_chen_cang:
			list = parseXML("level/an_du_chen_cang.xml", context);
			break;
		case LevelType.xiao_yan_chu_chao:
			list = parseXML("level/xiao_yan_chu_chao.xml", context);
			break;
		case LevelType.xu_wu_piao_miao:
			list = parseXML("level/xu_wu_piao_miao.xml", context);
			break;
		case LevelType.heng_xing_zhi_jiang:
			list = parseXML("level/heng_xing_zhi_jiang.xml", context);
			break;
		case LevelType.jin_zai_zhi_chi_1:
			list = parseXML("level/jin_zai_zhi_chi_1.xml", context);
			break;
		case LevelType.ceng_ceng_she_fang_1:
			list = parseXML("level/ceng_ceng_she_fang_1.xml", context);
			break;
		case LevelType.shui_hu_ju_yi:
			list = parseXML("level/shui_hu_ju_yi.xml", context);
			break;
		case LevelType.qian_jia_hou_gong:
			list = parseXML("level/qian_jia_hou_gong.xml", context);
			break;
		case LevelType.feng_jing_ma_liang_2:
			list = parseXML("level/feng_jing_ma_liang_2.xml", context);
			break;
		case LevelType.xi_ri_ba_zhu:
			list = parseXML("level/xi_ri_ba_zhu.xml", context);
			break;
		case LevelType.dan_shen_xiao_bing:
			list = parseXML("level/dan_shen_xiao_bing.xml", context);
			break;
		case LevelType.sheng_ji_ang_ran:
			list = parseXML("level/sheng_ji_ang_ran.xml", context);
			break;
		case LevelType.chang_tu_ba_she:
			list = parseXML("level/chang_tu_ba_she.xml", context);
			break;
		case LevelType.tun_bing_dong_lu:
			list = parseXML("level/tun_bing_dong_lu.xml", context);
			break;
		case LevelType.quan_tou:
			list = parseXML("level/quan_tou.xml", context);
			break;
		case LevelType.feng_jing_ma_liang_1:
			list = parseXML("level/feng_jing_ma_liang_1.xml", context);
			break;
		case LevelType.ceng_ceng_she_fang_2:
			list = parseXML("level/ceng_ceng_she_fang_2.xml", context);
			break;
		case LevelType.bing_jiang_lian_fang:
			list = parseXML("level/bing_jiang_lian_fang.xml", context);
			break;
		case LevelType.xiao_bin_tan_lu:
			list = parseXML("level/xiao_bin_tan_lu.xml", context);
			break;
		case LevelType.feng_hui_lu_zhuan:
			list = parseXML("level/feng_hui_lu_zhuan.xml", context);
			break;

		}

		return list;
	}

	public static List<PepoleData> parseXML(String path, Context c) {
		return null;
	}

}
