// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public final class h
    implements dgm
{

    public static final int A = 0x7f0c00de;
    public static final int B = 0x7f0c00dd;
    public static final int C = 0x7f0c034a;
    public static final int D = 0x7f0c0145;
    public static final int E = 0x7f0c00ab;
    public static final int F = 0x7f0c00bb;
    public static final int G = 0x7f0c014d;
    public static final int H = 0x7f0c00b4;
    public static final int I = 0x7f0c00b5;
    public static final int J = 0x7f0c0107;
    public static final int K = 0x7f0c0024;
    public static final int L = 0x7f0c00e6;
    public static final int M = 0x7f0c0323;
    public static final int N = 0x7f0c0325;
    public static final int O = 0x7f0c0324;
    public static final int P = 0x7f0c0176;
    public static final int Q = 0x7f0c0171;
    public static final int R = 0x7f0c0224;
    public static final int S = 0x7f0c02e1;
    public static final int T = 0x7f0c02e2;
    public static final int U = 0x7f0c01e1;
    public static final int V = 0x7f0c018b;
    public static final int W = 0x7f0c00ce;
    public static final int X = 0x7f0c01d9;
    public static final int Y = 0x7f0c0143;
    public static final int Z = 0x7f0c0268;
    public static Method a;
    public static final int aA = 0x7f0c0340;
    public static final int aB = 0x7f0c0151;
    public static final int aC = 0x7f0c0160;
    public static final int aD = 0x7f0c0165;
    public static final int aE = 0x7f0c0358;
    public static final int aF = 0x7f0c01e8;
    public static final int aG = 0x7f0c023b;
    public static final int aH = 0x7f0c00e3;
    public static final int aI = 0x7f0c00e5;
    public static final int aJ = 0x7f0c016c;
    public static final int aK = 0x7f0c033c;
    public static final int aL = 0x7f0c014f;
    public static final int aM = 0x7f0c01d1;
    public static final int aN = 0x7f0c018c;
    public static final int aO = 0x7f0c035c;
    public static final int aP = 0x7f0c0137;
    public static final int aQ = 0x7f0c0272;
    public static final int aR = 0x7f0c035b;
    public static final int aS = 0x7f0c0112;
    public static final int aT = 0x7f0c0237;
    public static final int aU = 0x7f0c029a;
    public static final int aV = 0x7f0c019c;
    public static final int aW = 0x7f0c019b;
    public static final int aX = 0x7f0c010e;
    public static final int aY = 0x7f0c018d;
    public static final int aZ = 0x7f0c0250;
    public static final int aa = 0x7f0c008d;
    public static final int ab = 0x7f0c00bc;
    public static final int ac = 0x7f0c0131;
    public static final int ad = 0x7f0c01ec;
    public static final int ae = 0x7f0c023e;
    public static final int af = 0x7f0c02d3;
    public static final int ag = 0x7f0c013a;
    public static final int ah = 0x7f0c013b;
    public static final int ai = 0x7f0c0141;
    public static final int aj = 0x7f0c0208;
    public static final int ak = 0x7f0c0209;
    public static final int al = 0x7f0c0108;
    public static final int am = 0x7f0c010b;
    public static final int an = 0x7f0c022e;
    public static final int ao = 0x7f0c0256;
    public static final int ap = 0x7f0c015d;
    public static final int aq = 0x7f0c015e;
    public static final int ar = 0x7f0c015f;
    public static final int as = 0x7f0c00b7;
    public static final int at = 0x7f0c016d;
    public static final int au = 0x7f0c014e;
    public static final int av = 0x7f0c0150;
    public static final int aw = 0x7f0c0162;
    public static final int ax = 0x7f0c012b;
    public static final int ay = 0x7f0c0146;
    public static final int az = 0x7f0c014b;
    public static boolean b = false;
    public static final int bA = 0x7f0c01c3;
    public static final int bB = 0x7f0c00eb;
    public static final int bC = 0x7f0c0138;
    public static final int bD = 0x7f0c01da;
    public static final int bE = 0x7f0c01db;
    public static final int bF = 0x7f0c01ea;
    public static final int bG = 0x7f0c01eb;
    public static final int bH = 0x7f0c01e5;
    public static final int bI = 0x7f0c01e6;
    public static final int bJ = 0x7f0c035a;
    public static final int bK = 0x7f0c013e;
    public static final int bL = 0x7f0c0192;
    public static final int bM = 0x7f0c02ee;
    public static final int bN = 0x7f0c01d8;
    public static final int bO = 0x7f0c0153;
    public static final int bP = 0x7f0c015c;
    public static final int bQ = 0x7f0c0203;
    public static final int bR = 0x7f0c0202;
    public static final int bS = 0x7f0c01d5;
    public static final int bT = 0x7f0c01d7;
    public static final int bU = 0x7f0c0201;
    public static final int bV = 0x7f0c0200;
    public static final int bW = 0x7f0c01f0;
    public static final int bX = 0x7f0c01ef;
    public static final int bY = 0x7f0c01f1;
    public static final int bZ = 0x7f0c01dd;
    public static final int ba = 0x7f0c015b;
    public static final int bb = 0x7f0c00e8;
    public static final int bc = 0x7f0c017e;
    public static final int bd = 0x7f0c0144;
    public static final int be = 0x7f0c019e;
    public static final int bf = 0x7f0c0196;
    public static final int bg = 0x7f0c028a;
    public static final int bh = 0x7f0c017a;
    public static final int bi = 0x7f0c01b1;
    public static final int bj = 0x7f0c01b0;
    public static final int bk = 0x7f0c01a7;
    public static final int bl = 0x7f0c01b6;
    public static final int bm = 0x7f0c01b2;
    public static final int bn = 0x7f0c01b4;
    public static final int bo = 0x7f0c01ae;
    public static final int bp = 0x7f0c01b3;
    public static final int bq = 0x7f0c01af;
    public static final int br = 0x7f0c0247;
    public static final int bs = 0x7f0c031a;
    public static final int bt = 0x7f0c0319;
    public static final int bu = 0x7f0c01a9;
    public static final int bv = 0x7f0c0154;
    public static final int bw = 0x7f0c0350;
    public static final int bx = 0x7f0c0193;
    public static final int by = 0x7f0c01c1;
    public static final int bz = 0x7f0c01c2;
    public static Method c;
    public static final int cA = 0x7f0c022a;
    public static final int cB = 0x7f0c0229;
    public static final int cC = 0x7f0c0228;
    public static final int cD = 0x7f0c022d;
    public static final int cE = 0x7f0c022c;
    public static final int cF = 0x7f0c022b;
    public static final int cG = 0x7f0c00c6;
    public static final int cH = 0x7f0c0185;
    public static final int cI = 0x7f0c0163;
    public static final int cJ = 0x7f0c0230;
    public static final int cK = 0x7f0c020b;
    public static final int cL = 0x7f0c020a;
    public static final int cM = 0x7f0c0080;
    public static final int cN = 0x7f0c0273;
    public static final int cO = 0x7f0c0225;
    public static final int cP = 0x7f0c034c;
    public static final int cQ = 0x7f0c025d;
    public static final int cR = 0x7f0c013d;
    public static final int cS = 0x7f0c015a;
    public static final int cT = 0x7f0c025f;
    public static final int cU = 0x7f0c025e;
    public static final int cV = 0x7f0c0236;
    public static final int cW = 0x7f0c0223;
    public static final int cX = 0x7f0c0246;
    public static final int cY = 0x7f0c0238;
    public static final int cZ = 0x7f0c0221;
    public static final int ca = 0x7f0c01f2;
    public static final int cb = 0x7f0c01df;
    public static final int cc = 0x7f0c01de;
    public static final int cd = 0x7f0c01ed;
    public static final int ce = 0x7f0c01e4;
    public static final int cf = 0x7f0c01f3;
    public static final int cg = 0x7f0c01fa;
    public static final int ch = 0x7f0c01ff;
    public static final int ci = 0x7f0c01fe;
    public static final int cj = 0x7f0c0249;
    public static final int ck = 0x7f0c024b;
    public static final int cl = 0x7f0c0248;
    public static final int cm = 0x7f0c024c;
    public static final int cn = 0x7f0c021e;
    public static final int co = 0x7f0c025a;
    public static final int cp = 0x7f0c01e3;
    public static final int cq = 0x7f0c0215;
    public static final int cr = 0x7f0c0212;
    public static final int cs = 0x7f0c0130;
    public static final int ct = 0x7f0c0214;
    public static final int cu = 0x7f0c0216;
    public static final int cv = 0x7f0c0213;
    public static final int cw = 0x7f0c01f4;
    public static final int cx = 0x7f0c01f5;
    public static final int cy = 0x7f0c01fc;
    public static final int cz = 0x7f0c0227;
    public static boolean d = false;
    public static final int dA = 0x7f0c0355;
    public static final int dB = 0x7f0c0348;
    public static final int dC = 0x7f0c0353;
    public static final int dD = 0x7f0c0352;
    public static final int dE = 0x7f0c02f1;
    public static final int dF = 0x7f0c02f0;
    public static final int dG = 0x7f0c0356;
    public static final int dH = 0x7f0c014c;
    public static final int dI = 0x7f0c0263;
    public static final int dJ = 0x7f0c0262;
    public static final int dK = 0x7f0c018a;
    public static final int dL = 0x7f0c0266;
    public static final int dM = 0x7f0c0265;
    public static final int dN = 0x7f0c0117;
    public static final int dO = 0x7f0c0159;
    public static final int dP = 0x7f0c0119;
    public static final int dQ = 0x7f0c00f8;
    public static final int dR = 0x7f0c01ab;
    public static final int dS = 0x7f0c00ee;
    public static final int dT = 0x7f0c0197;
    public static final int dU = 0x7f0c02d5;
    public static final int dV = 0x7f0c02d6;
    public static final int dW = 0x7f0c01aa;
    public static final int dX = 0x7f0c0284;
    public static final int dY = 0x7f0c0286;
    public static final int dZ = 0x7f0c0285;
    public static final int da = 0x7f0c0220;
    public static final int db = 0x7f0c0252;
    public static final int dc = 0x7f0c0251;
    public static final int dd = 0x7f0c024e;
    public static final int de = 0x7f0c034b;
    public static final int df = 0x7f0c0222;
    public static final int dg = 0x7f0c024d;
    public static final int dh = 0x7f0c021c;
    public static final int di = 0x7f0c0110;
    public static final int dj = 0x7f0c01d2;
    public static final int dk = 0x7f0c01fb;
    public static final int dl = 0x7f0c01f9;
    public static final int dm = 0x7f0c0258;
    public static final int dn = 0x7f0c00c8;
    public static final int _flddo = 0x7f0c031f;
    public static final int dp = 0x7f0c02d1;
    public static final int dq = 0x7f0c00f3;
    public static final int dr = 0x7f0c00f2;
    public static final int ds = 0x7f0c0170;
    public static final int dt = 0x7f0c0257;
    public static final int du = 0x7f0c00f0;
    public static final int dv = 0x7f0c00f1;
    public static final int dw = 0x7f0c010d;
    public static final int dx = 0x7f0c0354;
    public static final int dy = 0x7f0c00e9;
    public static final int dz = 0x7f0c0106;
    public static Field e;
    public static final int eA = 0x7f0c0179;
    public static final int eB = 0x7f0c0053;
    public static final int eC = 0x7f0c01ac;
    public static final int eD = 0x7f0c00e1;
    public static final int eE = 0x7f0c00df;
    public static final int eF = 0x7f0c0142;
    public static final int eG = 0x7f0c0211;
    public static final int eH = 0x7f0c019a;
    public static final int eI = 0x7f0c01ee;
    public static final int eJ = 0x7f0c0219;
    public static final int eK = 0x7f0c016a;
    public static final int eL = 0x7f0c02bc;
    public static final int eM = 0x7f0c023c;
    public static final int eN = 0x7f0c01fd;
    public static final int eO = 0x7f0c01e7;
    public static final int eP = 0x7f0c0177;
    public static final int eQ = 0x7f0c0178;
    public static final int eR = 0x7f0c0321;
    public static final int eS = 0x7f0c010a;
    public static final int eT = 0x7f0c0322;
    public static final int eU = 0x7f0c0299;
    public static final int eV = 0x7f0c0245;
    public static final int eW = 0x7f0c0336;
    public static final int eX = 0x7f0c033b;
    public static final int eY = 0x7f0c0338;
    public static final int eZ = 0x7f0c0341;
    public static final int ea = 0x7f0c0281;
    public static final int eb = 0x7f0c0282;
    public static final int ec = 0x7f0c0280;
    public static final int ed = 0x7f0c027e;
    public static final int ee = 0x7f0c0283;
    public static final int ef = 0x7f0c027f;
    public static final int eg = 0x7f0c02df;
    public static final int eh = 0x7f0c02de;
    public static final int ei = 0x7f0c00e2;
    public static final int ej = 0x7f0c02d8;
    public static final int ek = 0x7f0c02dd;
    public static final int el = 0x7f0c018f;
    public static final int em = 0x7f0c012f;
    public static final int en = 0x7f0c0240;
    public static final int eo = 0x7f0c0241;
    public static final int ep = 0x7f0c0242;
    public static final int eq = 0x7f0c0287;
    public static final int er = 0x7f0c0218;
    public static final int es = 0x7f0c01dc;
    public static final int et = 0x7f0c0133;
    public static final int eu = 0x7f0c0217;
    public static final int ev = 0x7f0c0293;
    public static final int ew = 0x7f0c020e;
    public static final int ex = 0x7f0c0297;
    public static final int ey = 0x7f0c0296;
    public static final int ez = 0x7f0c010f;
    public static boolean f = false;
    public static final int fA = 0x7f0c021b;
    public static final int fB = 0x7f0c016f;
    public static final int fC = 0x7f0c0359;
    public static final int fD = 0x7f0c035d;
    public static final int fE = 0x7f0c02d9;
    public static final int fF = 0x7f0c020d;
    public static final int fG = 0x7f0c024f;
    public static final int fH = 0x7f0c0210;
    public static final int fI = 0x7f0c017c;
    public static final int fJ = 0x7f0c032f;
    public static final int fK = 0x7f0c026c;
    public static final int fL = 0x7f0c026d;
    public static final int fM = 0x7f0c0269;
    public static final int fN = 0x7f0c00dc;
    public static final int fO = 0x7f0c016e;
    public static final int fP = 0x7f0c0195;
    public static final int fQ = 0x7f0c0180;
    public static final int fR = 0x7f0c017f;
    public static final int fS = 0x7f0c0181;
    public static final int fT = 0x7f0c0330;
    public static final int fU = 0x7f0c0194;
    public static final int fV = 0x7f0c00b6;
    public static final int fW = 0x7f0c026b;
    public static final int fX = 0x7f0c026e;
    public static final int fY = 0x7f0c012c;
    public static final int fZ = 0x7f0c00ed;
    public static final int fa = 0x7f0c0343;
    public static final int fb = 0x7f0c0332;
    public static final int fc = 0x7f0c0339;
    public static final int fd = 0x7f0c033d;
    public static final int fe = 0x7f0c0342;
    public static final int ff = 0x7f0c033f;
    public static final int fg = 0x7f0c0337;
    public static final int fh = 0x7f0c033e;
    public static final int fi = 0x7f0c0334;
    public static final int fj = 0x7f0c0333;
    public static final int fk = 0x7f0c004f;
    public static final int fl = 0x7f0c0244;
    public static final int fm = 0x7f0c033a;
    public static final int fn = 0x7f0c01a8;
    public static final int fo = 0x7f0c010c;
    public static final int fp = 0x7f0c01b7;
    public static final int fq = 0x7f0c01b8;
    public static final int fr = 0x7f0c020f;
    public static final int fs = 0x7f0c0132;
    public static final int ft = 0x7f0c017d;
    public static final int fu = 0x7f0c028e;
    public static final int fv = 0x7f0c028d;
    public static final int fw = 0x7f0c028c;
    public static final int fx = 0x7f0c028b;
    public static final int fy = 0x7f0c0288;
    public static final int fz = 0x7f0c0289;
    public static Field g;
    public static final int gA = 0x7f0c0311;
    public static final int gB = 0x7f0c022f;
    public static final int gC = 0x7f0c0055;
    public static final int gD = 0x7f0c032d;
    public static final int gE = 0x7f0c0327;
    public static final int gF = 0x7f0c032c;
    public static final int gG = 0x7f0c0329;
    public static final int gH = 0x7f0c032b;
    public static final int gI = 0x7f0c0118;
    public static final int gJ = 0x7f0c0318;
    public static final int gK = 0x7f0c0313;
    public static final int gL = 0x7f0c0315;
    public static final int gM = 0x7f0c0190;
    public static final int gN = 0x7f0c01e9;
    public static final int gO = 0x7f0c00f9;
    public static final int gP = 0x7f0c0233;
    public static final int gQ = 0x7f0c01cf;
    public static final int gR = 0x7f0c01d0;
    public static final int gS = 0x7f0c0152;
    public static final int gT = 0x7f0c0259;
    public static final int gU = 0x7f0c0051;
    public static final int gV = 0x7f0c0052;
    public static final int gW = 0x7f0c0351;
    public static final int gX = 0x7f0c00ea;
    public static final int gY = 0x7f0c0156;
    public static final int gZ = 0x7f0c0267;
    public static final int ga = 0x7f0c00e0;
    public static final int gb = 0x7f0c0198;
    public static final int gc = 0x7f0c0335;
    public static final int gd = 0x7f0c02f4;
    public static final int ge = 0x7f0c02f3;
    public static final int gf = 0x7f0c02f2;
    public static final int gg = 0x7f0c02f5;
    public static final int gh = 0x7f0c02f6;
    public static final int gi = 0x7f0c0134;
    public static final int gj = 0x7f0c0136;
    public static final int gk = 0x7f0c0135;
    public static final int gl = 0x7f0c012e;
    public static final int gm = 0x7f0c0161;
    public static final int gn = 0x7f0c01ad;
    public static final int go = 0x7f0c030c;
    public static final int gp = 0x7f0c012d;
    public static final int gq = 0x7f0c0172;
    public static final int gr = 0x7f0c0173;
    public static final int gs = 0x7f0c0174;
    public static final int gt = 0x7f0c0175;
    public static final int gu = 0x7f0c00d7;
    public static final int gv = 0x7f0c0191;
    public static final int gw = 0x7f0c026a;
    public static final int gx = 0x7f0c0155;
    public static final int gy = 0x7f0c0109;
    public static final int gz = 0x7f0c0081;
    public static boolean h = false;
    public static final int hA = 0x7f0c00cf;
    public static final int hB = 0x7f0c00d0;
    public static final int hC = 0x7f0c01c9;
    public static final int hD = 0x7f0c0303;
    public static final int hE = 0x7f0c0304;
    public static final int hF = 0x7f0c0306;
    public static final int hG = 0x7f0d00a3;
    public static final int hH = 0x7f0205b7;
    public static final int hI = 0x7f0205ce;
    public static final int hJ = 0x7f0205d8;
    public static final int hK = 0x7f02060b;
    public static final int hL = 0x7f02061d;
    public static final int hM = 0x7f02062f;
    public static final int hN = 0x7f040086;
    public static final int hO = 0x7f040101;
    public static final int hP = 0x7f040102;
    public static final int hQ = 0x7f040103;
    public static final int hR = 0x7f0900a2;
    public static final int hS = 0x7f0900a3;
    public static final int hT = 0x7f0900bc;
    public static final int hU = 0x7f0900bd;
    public static final int hV = 0x7f0900ba;
    public static final int hW = 0x7f0900bb;
    public static final int hX = 0x7f0900b3;
    public static final int hY = 0x7f0900b9;
    public static final int hZ = 0x7f0900b8;
    public static final int ha = 0x7f0c032e;
    public static final int hb = 0x7f0c0199;
    public static final int hc = 0x7f0c0149;
    public static final int hd = 0x7f0c014a;
    public static final int he = 0x7f09012b;
    public static final int hf = 0x7f09012c;
    public static final int hg = 0x7f09012a;
    public static final int hh = 0x7f09012d;
    public static final int hi = 0x7f0c029b;
    public static final int hj = 0x7f0c0114;
    public static final int hk = 0x7f0c029e;
    public static final int hl = 0x7f0c029d;
    public static final int hm = 0x7f0c029c;
    public static final int hn = 0x7f0c02c3;
    public static final int ho = 0x7f0c02c4;
    public static final int hp = 0x7f0c001a;
    public static final int hq = 0x7f08000f;
    public static final int hr = 0x7f080004;
    public static final int hs = 0x7f08000e;
    public static final int ht = 0x7f0d0292;
    public static final int hu = 0x7f0d0293;
    public static final int hv = 0x7f0d00cd;
    public static final int hw = 0x7f02047e;
    public static final int hx = 0x7f020655;
    public static final int hy = 0x7f0d0075;
    public static final int hz = 0x7f0d005d;
    public static Method i;
    public static final int iA = 0x7f0c00ca;
    public static final int iB = 0x7f0c0253;
    public static final int iC = 0x7f0c02c2;
    public static final int iD = 0x7f0900ef;
    public static final int iE = 0x7f09007e;
    public static final int iF = 0x7f090062;
    public static final int iG = 0x7f09006f;
    public static final int iH = 0x7f09006a;
    public static final int iI = 0x7f0900e3;
    public static final int iJ = 0x7f090068;
    public static final int iK = 0x7f090069;
    public static final int iL = 0x7f09007c;
    public static final int iM = 0x7f090060;
    public static final int iN = 0x7f09007a;
    public static final int iO = 0x7f09007b;
    public static final int iP = 0x7f090079;
    public static final int iQ = 0x7f090071;
    public static final int iR = 0x7f090070;
    public static final int iS = 0x7f090076;
    public static final int iT = 0x7f090077;
    public static final int iU = 0x7f09006b;
    public static final int iV = 0x7f09006c;
    public static final int iW = 0x7f090066;
    public static final int iX = 0x7f0900e4;
    public static final int iY = 0x7f0900e6;
    public static final int iZ = 0x7f0900e5;
    public static final int ia = 0x7f0900b7;
    public static final int ib = 0x7f0900a1;
    public static final int ic = 0x7f0900b1;
    public static final int id = 0x7f0900b0;
    public static final int ie = 0x7f0900a0;
    public static final int _fldif = 0x7f0900b4;
    public static final int ig = 0x7f0900b5;
    public static final int ih = 0x7f0900b6;
    public static final int ii = 0x7f09009e;
    public static final int ij = 0x7f0900ac;
    public static final int ik = 0x7f0900ad;
    public static final int il = 0x7f09009f;
    public static final int im = 0x7f0900a5;
    public static final int in = 0x7f0900a4;
    public static final int io = 0x7f0900ae;
    public static final int ip = 0x7f0900af;
    public static final int iq = 0x7f0900a6;
    public static final int ir = 0x7f0900a7;
    public static final int is = 0x7f0900a8;
    public static final int it = 0x7f0900aa;
    public static final int iu = 0x7f0900a9;
    public static final int iv = 0x7f0900ab;
    public static final int iw = 0x7f0d0014;
    public static final int ix = 0x7f0d012a;
    public static final int iy = 0x7f0d012b;
    public static final int iz = 0x7f0c00c9;
    public static boolean j = false;
    public static final int ja = 0x7f0d00ce;
    public static final int jb = 0x7f0d00d0;
    public static final int jc = 0x7f04006d;
    public static final int jd = 0x7f0400bc;
    public static final int je = 0x7f0400ba;
    public static final int jf = 0x7f04001e;
    public static final int jg = 0x7f040025;
    public static final int jh = 0x7f040029;
    public static final int ji = 0x7f0400c4;
    public static final int jj = 0x7f04010b;
    public static final int jk = 0x7f04010c;
    public static final int jl = 0x7f0a0071;
    public static final int jm = 0x7f0a0073;
    public static final int jn = 0x7f0a0072;
    public static final int jo = 0x7f0a0074;
    public static final int jp = 0x7f0a0070;
    public static final int jq = 0x7f0d007a;
    public static final int jr = 0x7f0b0000;
    public static final int js = 0x7f04006c;
    public static Method jt;
    public static final int k = 0x7f0c0226;
    public static final int l = 0x7f0c00b8;
    public static final int m = 0x7f0c00b9;
    public static final int n = 0x7f0c00a5;
    public static final int o = 0x7f0c02dc;
    public static final int p = 0x7f0c02e0;
    public static final int q = 0x7f0c02d7;
    public static final int r = 0x7f0c02db;
    public static final int s = 0x7f0c021a;
    public static final int t = 0x7f0c0331;
    public static final int u = 0x7f0c00d8;
    public static final int v = 0x7f0c017b;
    public static final int w = 0x7f0c0264;
    public static final int x = 0x7f0c0140;
    public static final int y = 0x7f0c0260;
    public static final int z = 0x7f0c0139;
    private final List ju;
    private String jv;
    private dl jw;
    private PendingIntent jx;
    private PendingIntent jy;
    private long jz;

    public h()
    {
    }

    public h(String s1)
    {
        ju = new ArrayList();
        jv = s1;
    }

    public static int a(Drawable drawable)
    {
        if (!d)
        {
            int i1;
            try
            {
                Method method = android/graphics/drawable/Drawable.getDeclaredMethod("getLayoutDirection", new Class[0]);
                c = method;
                method.setAccessible(true);
            }
            catch (NoSuchMethodException nosuchmethodexception) { }
            d = true;
        }
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        i1 = ((Integer)c.invoke(drawable, new Object[0])).intValue();
        return i1;
        drawable;
        c = null;
        return -1;
    }

    public static int a(Set set)
    {
        set = set.iterator();
        int i1 = 0;
        while (set.hasNext()) 
        {
            Object obj = set.next();
            int j1;
            if (obj != null)
            {
                j1 = obj.hashCode();
            } else
            {
                j1 = 0;
            }
            i1 = ~~(i1 + j1);
        }
        return i1;
    }

    public static long a(long l1, long l2)
    {
        long l3 = l1 + l2;
        if ((l1 ^ l3) < 0L && (l1 ^ l2) >= 0L)
        {
            throw new ArithmeticException((new StringBuilder(79)).append("The calculation caused an overflow: ").append(l1).append(" + ").append(l2).toString());
        } else
        {
            return l3;
        }
    }

    public static Drawable a(CompoundButton compoundbutton)
    {
        if (!h)
        {
            try
            {
                Field field = android/widget/CompoundButton.getDeclaredField("mButtonDrawable");
                g = field;
                field.setAccessible(true);
            }
            catch (NoSuchFieldException nosuchfieldexception) { }
            h = true;
        }
        if (g == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        compoundbutton = (Drawable)g.get(compoundbutton);
        return compoundbutton;
        compoundbutton;
        g = null;
        return null;
    }

    public static InputMethodManager a(Context context)
    {
        return (InputMethodManager)context.getSystemService("input_method");
    }

    public static Object a(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("null reference");
        } else
        {
            return obj;
        }
    }

    public static Object a(Object obj, Object obj1)
    {
        if (obj == null)
        {
            throw new NullPointerException(String.valueOf(obj1));
        } else
        {
            return obj;
        }
    }

    public static RuntimeException a(Throwable throwable)
    {
        Throwable throwable1 = (Throwable)b(throwable);
        g.a(throwable1, java/lang/Error);
        g.a(throwable1, java/lang/RuntimeException);
        throw new RuntimeException(throwable);
    }

    public static String a(Class class1)
    {
        class1 = class1.getName().replaceAll("\\$[0-9]+", "\\$");
        int j1 = class1.lastIndexOf('$');
        int i1 = j1;
        if (j1 == -1)
        {
            i1 = class1.lastIndexOf('.');
        }
        return class1.substring(i1 + 1);
    }

    public static String a(String s1, Object obj)
    {
        if (TextUtils.isEmpty(s1))
        {
            throw new IllegalArgumentException(String.valueOf(obj));
        } else
        {
            return s1;
        }
    }

    public static transient String a(String s1, Object aobj[])
    {
        int i1 = 0;
        s1 = String.valueOf(s1);
        StringBuilder stringbuilder = new StringBuilder(s1.length() + aobj.length * 16);
        int j1 = 0;
        do
        {
            if (i1 >= aobj.length)
            {
                break;
            }
            int k1 = s1.indexOf("%s", j1);
            if (k1 == -1)
            {
                break;
            }
            stringbuilder.append(s1.substring(j1, k1));
            stringbuilder.append(aobj[i1]);
            j1 = k1 + 2;
            i1++;
        } while (true);
        stringbuilder.append(s1.substring(j1));
        if (i1 < aobj.length)
        {
            stringbuilder.append(" [");
            stringbuilder.append(aobj[i1]);
            for (i1++; i1 < aobj.length; i1++)
            {
                stringbuilder.append(", ");
                stringbuilder.append(aobj[i1]);
            }

            stringbuilder.append(']');
        }
        return stringbuilder.toString();
    }

    public static ArrayList a(Iterable iterable)
    {
        n.b(iterable);
        if (iterable instanceof Collection)
        {
            return new ArrayList(jkm.a(iterable));
        } else
        {
            return a(iterable.iterator());
        }
    }

    public static ArrayList a(Iterator iterator)
    {
        ArrayList arraylist = new ArrayList();
        jmr.a(arraylist, iterator);
        return arraylist;
    }

    public static transient ArrayList a(Object aobj[])
    {
        n.b(((Object) (aobj)));
        int i1 = aobj.length;
        g.c(i1, "arraySize");
        long l1 = i1;
        ArrayList arraylist = new ArrayList(jrq.a((long)(i1 / 10) + (5L + l1)));
        Collections.addAll(arraylist, aobj);
        return arraylist;
    }

    public static HashSet a(int i1)
    {
        return new HashSet(jpc.a(i1));
    }

    public static void a(int i1, long l1, int j1, byy byy1)
    {
        Object obj;
        Object obj1 = null;
        if (l1 <= 0L)
        {
            return;
        }
        jfe jfe1 = new jfe();
        long l2 = byy1.a;
        if (l2 == 0L)
        {
            obj = null;
        } else
        {
            obj = new jfd();
            obj.a = Long.valueOf(l2);
        }
        jfe1.d = ((jfd) (obj));
        obj = new jfk();
        obj.a = Integer.valueOf(18);
        obj.r = Integer.valueOf(1);
        obj.d = Integer.valueOf(byy1.m);
        obj.t = Long.valueOf(l1);
        obj.f = Integer.valueOf(j1);
        obj.C = byy1.g;
        obj.y = Long.toString(dcx.a());
        if (byy1.d != null)
        {
            obj.p = Long.valueOf(aoe.d(byy1.d));
        }
        if (byy1.f > 0L)
        {
            obj.B = Long.valueOf(byy1.f);
        }
        if (byy1.c > 0)
        {
            obj.v = new jfg();
            ((jfk) (obj)).v.d = Integer.valueOf(byy1.c);
        }
        if (byy1.e != null)
        {
            obj.x = new jfl();
            ((jfk) (obj)).x.a = byy1.e;
        }
        if (byy1.b != null)
        {
            obj.b = new jfm();
            ((jfk) (obj)).b.a = byy1.b;
        }
        if (byy1.j != null)
        {
            jfj jfj1 = new jfj();
            jfj1.a = byy1.j;
            jfj1.b = Integer.valueOf(byy1.k);
            jfj1.c = Integer.valueOf(byy1.l);
            obj.z = new jfj[1];
            ((jfk) (obj)).z[0] = jfj1;
        }
        if (j1 == 2 || j1 == 5)
        {
            gcp gcp1 = (gcp)hgx.a(g.nS, gcp);
            obj.A = new jfi();
            ((jfk) (obj)).A.a = Integer.valueOf(gcp1.a());
        }
        jfe1.b = ((jfk) (obj));
        if (byy1.h != null || byy1.i != null) goto _L2; else goto _L1
_L1:
        obj = obj1;
_L4:
        jfe1.c = ((jen) (obj));
        if ((j1 == 2 || j1 == 1) && i1 != -1)
        {
            byy1 = dbq.M(i1);
            if (byy1.length != 0)
            {
                if (jfe1.a == null)
                {
                    jfe1.a = new jew();
                }
                if (jfe1.a.k == null)
                {
                    jfe1.a.k = new jeu();
                }
                jfe1.a.k.b = byy1;
            }
        }
        ((gap)hgx.a(g.nS, gap)).a(i1).b(jfe1);
        return;
_L2:
        jen jen1 = new jen();
        jen1.a = new jep();
        if (byy1.i != null)
        {
            jen1.a.g = Boolean.valueOf(g.a(byy1.i, false));
        }
        obj = jen1;
        if (byy1.h != null)
        {
            jen1.a.a = Boolean.valueOf(aoe.a(byy1.h.a));
            jen1.a.b = Boolean.valueOf(byy1.h.b);
            jen1.a.c = Boolean.valueOf(byy1.h.c);
            jen1.a.d = Integer.valueOf(byy1.h.g);
            jen1.a.h = Long.valueOf(byy1.h.i);
            jen1.a.i = Long.valueOf(byy1.h.j);
            jen1.a.j = Long.valueOf(byy1.h.k);
            jen1.b = new jeo();
            jen1.b.a = Boolean.valueOf(byy1.h.e);
            obj = jen1.b;
            boolean flag;
            if (!byy1.h.h)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj.b = Boolean.valueOf(flag);
            jen1.c = new jeq();
            jen1.c.a = Boolean.valueOf(byy1.h.d);
            jen1.c.b = Integer.valueOf(byy1.h.f);
            obj = jen1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(Drawable drawable, int i1)
    {
        if (drawable instanceof fm)
        {
            ((fm)drawable).setTint(i1);
        }
    }

    public static void a(Drawable drawable, ColorStateList colorstatelist)
    {
        if (drawable instanceof fm)
        {
            ((fm)drawable).setTintList(colorstatelist);
        }
    }

    public static void a(Drawable drawable, android.graphics.PorterDuff.Mode mode)
    {
        if (drawable instanceof fm)
        {
            ((fm)drawable).setTintMode(mode);
        }
    }

    public static void a(LayoutInflater layoutinflater, android.view.LayoutInflater.Factory2 factory2)
    {
        if (!f)
        {
            try
            {
                Field field = android/view/LayoutInflater.getDeclaredField("mFactory2");
                e = field;
                field.setAccessible(true);
            }
            catch (NoSuchFieldException nosuchfieldexception)
            {
                Log.e("LayoutInflaterCompatHC", (new StringBuilder("forceSetFactory2 Could not find field 'mFactory2' on class ")).append(android/view/LayoutInflater.getName()).append("; inflation may have unexpected results.").toString(), nosuchfieldexception);
            }
            f = true;
        }
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        e.set(layoutinflater, factory2);
        return;
        factory2;
        Log.e("LayoutInflaterCompatHC", (new StringBuilder("forceSetFactory2 could not set the Factory2 on LayoutInflater ")).append(layoutinflater).append("; inflation may have unexpected results.").toString(), factory2);
        return;
    }

    public static void a(View view)
    {
        InputMethodManager inputmethodmanager;
        if (view != null)
        {
            if ((inputmethodmanager = a(view.getContext())) != null)
            {
                inputmethodmanager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                return;
            }
        }
    }

    public static void a(ap ap1)
    {
        if (jt == null)
        {
            try
            {
                jt = ap1.getClass().getMethod("noteStateNotSaved", new Class[0]);
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                d();
            }
        }
        try
        {
            ((Method)g.d(jt)).invoke(ap1, new Object[0]);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ap ap1)
        {
            d();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ap ap1)
        {
            d();
        }
    }

    public static void a(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
    }

    public static void a(lcy lcy1, int i1, int j1, int k1)
    {
        if (i1 < j1 || i1 > k1)
        {
            throw new ldk(lcy1.a(), Integer.valueOf(i1), Integer.valueOf(j1), Integer.valueOf(k1));
        } else
        {
            return;
        }
    }

    public static void a(boolean flag)
    {
        if (!flag)
        {
            throw new IllegalStateException();
        } else
        {
            return;
        }
    }

    public static void a(boolean flag, Object obj)
    {
        if (!flag)
        {
            throw new IllegalStateException(String.valueOf(obj));
        } else
        {
            return;
        }
    }

    public static transient void a(boolean flag, String s1, Object aobj[])
    {
        if (!flag)
        {
            throw new IllegalArgumentException(String.format(s1, aobj));
        } else
        {
            return;
        }
    }

    public static boolean a(AccessibilityManager accessibilitymanager)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return accessibilitymanager.isTouchExplorationEnabled();
        } else
        {
            return false;
        }
    }

    public static boolean a(List list, Object obj)
    {
        if (obj != n.b(list))
        {
            if (!(obj instanceof List))
            {
                return false;
            }
            obj = (List)obj;
            if (list.size() != ((List) (obj)).size() || !jmr.a(list.iterator(), ((List) (obj)).iterator()))
            {
                return false;
            }
        }
        return true;
    }

    public static boolean a(Set set, Object obj)
    {
        if (set != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof Set))
        {
            break MISSING_BLOCK_LABEL_54;
        }
        obj = (Set)obj;
        boolean flag;
        try
        {
            if (set.size() != ((Set) (obj)).size())
            {
                break; /* Loop/switch isn't completed */
            }
            flag = set.containsAll(((Collection) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            return false;
        }
        if (flag) goto _L1; else goto _L3
_L3:
        return false;
        return false;
    }

    public static boolean a(Set set, Collection collection)
    {
        n.b(collection);
        Object obj = collection;
        if (collection instanceof jpm)
        {
            obj = ((jpm)collection).a();
        }
        if ((obj instanceof Set) && ((Collection) (obj)).size() > set.size())
        {
            return jmr.a(set.iterator(), ((Collection) (obj)));
        } else
        {
            return a(set, ((Collection) (obj)).iterator());
        }
    }

    public static boolean a(Set set, Iterator iterator)
    {
        boolean flag;
        for (flag = false; iterator.hasNext(); flag |= set.remove(iterator.next())) { }
        return flag;
    }

    public static Bundle[] a(dr adr[])
    {
        if (adr == null)
        {
            return null;
        }
        Bundle abundle[] = new Bundle[adr.length];
        for (int i1 = 0; i1 < adr.length; i1++)
        {
            dr dr1 = adr[i1];
            Bundle bundle = new Bundle();
            bundle.putString("resultKey", dr1.a());
            bundle.putCharSequence("label", dr1.b());
            bundle.putCharSequenceArray("choices", dr1.c());
            bundle.putBoolean("allowFreeFormInput", dr1.d());
            bundle.putBundle("extras", dr1.e());
            abundle[i1] = bundle;
        }

        return abundle;
    }

    public static int b(long l1)
    {
        if (0xffffffff80000000L <= l1 && l1 <= 0x7fffffffL)
        {
            return (int)l1;
        } else
        {
            throw new ArithmeticException((new StringBuilder(48)).append("Value cannot fit in an int: ").append(l1).toString());
        }
    }

    public static int b(List list, Object obj)
    {
        for (list = list.listIterator(); list.hasNext();)
        {
            if (n.a(obj, list.next()))
            {
                return list.previousIndex();
            }
        }

        return -1;
    }

    public static Object b(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException();
        } else
        {
            return obj;
        }
    }

    public static Object b(Object obj, Object obj1)
    {
        if (obj != null)
        {
            return obj;
        } else
        {
            return n.b(obj1);
        }
    }

    public static String b(String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            throw new IllegalArgumentException("Given String is empty or null");
        } else
        {
            return s1;
        }
    }

    public static ArrayList b()
    {
        return new ArrayList();
    }

    public static LinkedList b(Iterable iterable)
    {
        LinkedList linkedlist = new LinkedList();
        if (iterable instanceof Collection)
        {
            linkedlist.addAll(jkm.a(iterable));
            return linkedlist;
        } else
        {
            jmr.a(linkedlist, ((Iterable)n.b(iterable)).iterator());
            return linkedlist;
        }
    }

    public static void b(boolean flag)
    {
        if (!flag)
        {
            throw new IllegalArgumentException();
        } else
        {
            return;
        }
    }

    public static void b(boolean flag, Object obj)
    {
        if (!flag)
        {
            throw new IllegalArgumentException(String.valueOf(obj));
        } else
        {
            return;
        }
    }

    public static int c(List list, Object obj)
    {
        for (list = list.listIterator(list.size()); list.hasPrevious();)
        {
            if (n.a(obj, list.previous()))
            {
                return list.nextIndex();
            }
        }

        return -1;
    }

    public static HashSet c()
    {
        return new HashSet();
    }

    public static jgx c(Object obj)
    {
        return new jgx(a(obj.getClass()));
    }

    public static void c(String s1)
    {
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            throw new IllegalStateException(s1);
        } else
        {
            return;
        }
    }

    public static boolean c(Object obj, Object obj1)
    {
        if (obj == obj1)
        {
            return true;
        }
        if (obj == null || obj1 == null)
        {
            return false;
        } else
        {
            return obj.equals(obj1);
        }
    }

    private static void d()
    {
        throw new IllegalStateException("Could not access method FragmentManager#noteStateNotSaved");
    }

    public static void d(String s1)
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException(s1);
        } else
        {
            return;
        }
    }

    public g a()
    {
        String as1[] = (String[])ju.toArray(new String[ju.size()]);
        String s1 = jv;
        dl dl1 = jw;
        PendingIntent pendingintent = jy;
        PendingIntent pendingintent1 = jx;
        long l1 = jz;
        return new g(as1, dl1, pendingintent, pendingintent1, new String[] {
            s1
        }, l1);
    }

    public h a(long l1)
    {
        jz = l1;
        return this;
    }

    public h a(PendingIntent pendingintent)
    {
        jx = pendingintent;
        return this;
    }

    public h a(PendingIntent pendingintent, dl dl1)
    {
        jw = dl1;
        jy = pendingintent;
        return this;
    }

    public h a(String s1)
    {
        ju.add(s1);
        return this;
    }

    public void a(int i1, ani ani, dgu dgu)
    {
        gbh.b();
    }
}
