// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
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
import java.util.Set;

public final class h
    implements dhv
{

    public static final int A = 0x7f0d00dd;
    public static final int B = 0x7f0d033c;
    public static final int C = 0x7f0d013c;
    public static final int D = 0x7f0d00ab;
    public static final int E = 0x7f0d00bb;
    public static final int F = 0x7f0d0144;
    public static final int G = 0x7f0d00f6;
    public static final int H = 0x7f0d00b4;
    public static final int I = 0x7f0d00b5;
    public static final int J = 0x7f0d0107;
    public static final int K = 0x7f0d0024;
    public static final int L = 0x7f0d00e6;
    public static final int M = 0x7f0d0313;
    public static final int N = 0x7f0d0315;
    public static final int O = 0x7f0d0314;
    public static final int P = 0x7f0d016d;
    public static final int Q = 0x7f0d0168;
    public static final int R = 0x7f0d0216;
    public static final int S = 0x7f0d02d0;
    public static final int T = 0x7f0d02d1;
    public static final int U = 0x7f0d01d5;
    public static final int V = 0x7f0d0183;
    public static final int W = 0x7f0d00ce;
    public static final int X = 0x7f0d01cd;
    public static final int Y = 0x7f0d0258;
    public static final int Z = 0x7f0d008d;
    public static Method a;
    public static final int aA = 0x7f0d01dc;
    public static final int aB = 0x7f0d022d;
    public static final int aC = 0x7f0d00e3;
    public static final int aD = 0x7f0d00e5;
    public static final int aE = 0x7f0d0163;
    public static final int aF = 0x7f0d032e;
    public static final int aG = 0x7f0d0146;
    public static final int aH = 0x7f0d0184;
    public static final int aI = 0x7f0d034e;
    public static final int aJ = 0x7f0d0137;
    public static final int aK = 0x7f0d0262;
    public static final int aL = 0x7f0d034d;
    public static final int aM = 0x7f0d0112;
    public static final int aN = 0x7f0d0229;
    public static final int aO = 0x7f0d028a;
    public static final int aP = 0x7f0d0194;
    public static final int aQ = 0x7f0d0193;
    public static final int aR = 0x7f0d010e;
    public static final int aS = 0x7f0d0185;
    public static final int aT = 0x7f0d023f;
    public static final int aU = 0x7f0d0152;
    public static final int aV = 0x7f0d00e8;
    public static final int aW = 0x7f0d0175;
    public static final int aX = 0x7f0d013b;
    public static final int aY = 0x7f0d0196;
    public static final int aZ = 0x7f0d018e;
    public static final int aa = 0x7f0d00bc;
    public static final int ab = 0x7f0d0130;
    public static final int ac = 0x7f0d01e0;
    public static final int ad = 0x7f0d02c1;
    public static final int ae = 0x7f0d013a;
    public static final int af = 0x7f0d01fa;
    public static final int ag = 0x7f0d01fb;
    public static final int ah = 0x7f0d0108;
    public static final int ai = 0x7f0d010b;
    public static final int aj = 0x7f0d0220;
    public static final int ak = 0x7f0d0154;
    public static final int al = 0x7f0d0155;
    public static final int am = 0x7f0d0156;
    public static final int an = 0x7f0d00b7;
    public static final int ao = 0x7f0d0164;
    public static final int ap = 0x7f0d0145;
    public static final int aq = 0x7f0d0147;
    public static final int ar = 0x7f0d0159;
    public static final int as = 0x7f0d012a;
    public static final int at = 0x7f0d013d;
    public static final int au = 0x7f0d0142;
    public static final int av = 0x7f0d0332;
    public static final int aw = 0x7f0d0148;
    public static final int ax = 0x7f0d0157;
    public static final int ay = 0x7f0d015c;
    public static final int az = 0x7f0d034a;
    public static boolean b = false;
    public static final int bA = 0x7f0d01df;
    public static final int bB = 0x7f0d01d9;
    public static final int bC = 0x7f0d01da;
    public static final int bD = 0x7f0d034c;
    public static final int bE = 0x7f0d018a;
    public static final int bF = 0x7f0d02dd;
    public static final int bG = 0x7f0d01cc;
    public static final int bH = 0x7f0d014a;
    public static final int bI = 0x7f0d0153;
    public static final int bJ = 0x7f0d01cb;
    public static final int bK = 0x7f0d01f5;
    public static final int bL = 0x7f0d01f4;
    public static final int bM = 0x7f0d01e4;
    public static final int bN = 0x7f0d01e3;
    public static final int bO = 0x7f0d01e5;
    public static final int bP = 0x7f0d01d1;
    public static final int bQ = 0x7f0d01e6;
    public static final int bR = 0x7f0d01d3;
    public static final int bS = 0x7f0d01d2;
    public static final int bT = 0x7f0d01e1;
    public static final int bU = 0x7f0d01d8;
    public static final int bV = 0x7f0d01e7;
    public static final int bW = 0x7f0d01ee;
    public static final int bX = 0x7f0d01f3;
    public static final int bY = 0x7f0d01f2;
    public static final int bZ = 0x7f0d0238;
    public static final int ba = 0x7f0d027a;
    public static final int bb = 0x7f0d0171;
    public static final int bc = 0x7f0d01a9;
    public static final int bd = 0x7f0d01a8;
    public static final int be = 0x7f0d019f;
    public static final int bf = 0x7f0d01ae;
    public static final int bg = 0x7f0d01aa;
    public static final int bh = 0x7f0d01ac;
    public static final int bi = 0x7f0d01a6;
    public static final int bj = 0x7f0d01ab;
    public static final int bk = 0x7f0d01a7;
    public static final int bl = 0x7f0d0236;
    public static final int bm = 0x7f0d030a;
    public static final int bn = 0x7f0d0309;
    public static final int bo = 0x7f0d01a1;
    public static final int bp = 0x7f0d014b;
    public static final int bq = 0x7f0d0342;
    public static final int br = 0x7f0d018b;
    public static final int bs = 0x7f0d01b9;
    public static final int bt = 0x7f0d01ba;
    public static final int bu = 0x7f0d01bb;
    public static final int bv = 0x7f0d00eb;
    public static final int bw = 0x7f0d0138;
    public static final int bx = 0x7f0d01ce;
    public static final int by = 0x7f0d01cf;
    public static final int bz = 0x7f0d01de;
    public static Method c;
    public static final int cA = 0x7f0d01fd;
    public static final int cB = 0x7f0d01fc;
    public static final int cC = 0x7f0d0080;
    public static final int cD = 0x7f0d0263;
    public static final int cE = 0x7f0d0217;
    public static final int cF = 0x7f0d033e;
    public static final int cG = 0x7f0d024a;
    public static final int cH = 0x7f0d0151;
    public static final int cI = 0x7f0d024c;
    public static final int cJ = 0x7f0d024b;
    public static final int cK = 0x7f0d0228;
    public static final int cL = 0x7f0d0215;
    public static final int cM = 0x7f0d0235;
    public static final int cN = 0x7f0d022a;
    public static final int cO = 0x7f0d0213;
    public static final int cP = 0x7f0d0212;
    public static final int cQ = 0x7f0d0241;
    public static final int cR = 0x7f0d0240;
    public static final int cS = 0x7f0d023d;
    public static final int cT = 0x7f0d033d;
    public static final int cU = 0x7f0d0214;
    public static final int cV = 0x7f0d023c;
    public static final int cW = 0x7f0d020e;
    public static final int cX = 0x7f0d0110;
    public static final int cY = 0x7f0d01ef;
    public static final int cZ = 0x7f0d01ed;
    public static final int ca = 0x7f0d023a;
    public static final int cb = 0x7f0d0237;
    public static final int cc = 0x7f0d023b;
    public static final int cd = 0x7f0d0210;
    public static final int ce = 0x7f0d0247;
    public static final int cf = 0x7f0d01d7;
    public static final int cg = 0x7f0d0207;
    public static final int ch = 0x7f0d0204;
    public static final int ci = 0x7f0d012f;
    public static final int cj = 0x7f0d0206;
    public static final int ck = 0x7f0d0208;
    public static final int cl = 0x7f0d0205;
    public static final int cm = 0x7f0d01e8;
    public static final int cn = 0x7f0d01e9;
    public static final int co = 0x7f0d01f0;
    public static final int cp = 0x7f0d0219;
    public static final int cq = 0x7f0d021c;
    public static final int cr = 0x7f0d021b;
    public static final int cs = 0x7f0d021a;
    public static final int ct = 0x7f0d021f;
    public static final int cu = 0x7f0d021e;
    public static final int cv = 0x7f0d021d;
    public static final int cw = 0x7f0d00c6;
    public static final int cx = 0x7f0d017d;
    public static final int cy = 0x7f0d015a;
    public static final int cz = 0x7f0d0222;
    public static boolean d = false;
    public static final int dA = 0x7f0d0254;
    public static final int dB = 0x7f0d0252;
    public static final int dC = 0x7f0d0116;
    public static final int dD = 0x7f0d0132;
    public static final int dE = 0x7f0d0150;
    public static final int dF = 0x7f0d0255;
    public static final int dG = 0x7f0d0118;
    public static final int dH = 0x7f0d00f8;
    public static final int dI = 0x7f0d01a3;
    public static final int dJ = 0x7f0d00ee;
    public static final int dK = 0x7f0d018f;
    public static final int dL = 0x7f0d02c3;
    public static final int dM = 0x7f0d02c4;
    public static final int dN = 0x7f0d01a2;
    public static final int dO = 0x7f0d02cd;
    public static final int dP = 0x7f0d02cc;
    public static final int dQ = 0x7f0d00e2;
    public static final int dR = 0x7f0d02c6;
    public static final int dS = 0x7f0d02cb;
    public static final int dT = 0x7f0d0187;
    public static final int dU = 0x7f0d012e;
    public static final int dV = 0x7f0d022f;
    public static final int dW = 0x7f0d0230;
    public static final int dX = 0x7f0d0231;
    public static final int dY = 0x7f0d0277;
    public static final int dZ = 0x7f0d0251;
    public static final int da = 0x7f0d0245;
    public static final int db = 0x7f0d00c8;
    public static final int dc = 0x7f0d030f;
    public static final int dd = 0x7f0d02bf;
    public static final int de = 0x7f0d00f3;
    public static final int df = 0x7f0d00f2;
    public static final int dg = 0x7f0d0167;
    public static final int dh = 0x7f0d0244;
    public static final int di = 0x7f0d00f0;
    public static final int dj = 0x7f0d00f1;
    public static final int dk = 0x7f0d010d;
    public static final int dl = 0x7f0d0346;
    public static final int dm = 0x7f0d00e9;
    public static final int dn = 0x7f0d0106;
    public static final int _flddo = 0x7f0d0347;
    public static final int dp = 0x7f0d033a;
    public static final int dq = 0x7f0d0345;
    public static final int dr = 0x7f0d0344;
    public static final int ds = 0x7f0d02e0;
    public static final int dt = 0x7f0d02df;
    public static final int du = 0x7f0d0348;
    public static final int dv = 0x7f0d0143;
    public static final int dw = 0x7f0d0250;
    public static final int dx = 0x7f0d024f;
    public static final int dy = 0x7f0d0182;
    public static final int dz = 0x7f0d0256;
    public static Field e;
    public static final int eA = 0x7f0d010a;
    public static final int eB = 0x7f0d0312;
    public static final int eC = 0x7f0d0289;
    public static final int eD = 0x7f0d0234;
    public static final int eE = 0x7f0d0328;
    public static final int eF = 0x7f0d032d;
    public static final int eG = 0x7f0d032a;
    public static final int eH = 0x7f0d0333;
    public static final int eI = 0x7f0d0335;
    public static final int eJ = 0x7f0d0324;
    public static final int eK = 0x7f0d032b;
    public static final int eL = 0x7f0d032f;
    public static final int eM = 0x7f0d0334;
    public static final int eN = 0x7f0d0331;
    public static final int eO = 0x7f0d0329;
    public static final int eP = 0x7f0d0330;
    public static final int eQ = 0x7f0d0326;
    public static final int eR = 0x7f0d0325;
    public static final int eS = 0x7f0d004f;
    public static final int eT = 0x7f0d0233;
    public static final int eU = 0x7f0d032c;
    public static final int eV = 0x7f0d01a0;
    public static final int eW = 0x7f0d010c;
    public static final int eX = 0x7f0d01af;
    public static final int eY = 0x7f0d01b0;
    public static final int eZ = 0x7f0d0201;
    public static final int ea = 0x7f0d020a;
    public static final int eb = 0x7f0d01d0;
    public static final int ec = 0x7f0d0133;
    public static final int ed = 0x7f0d0209;
    public static final int ee = 0x7f0d0283;
    public static final int ef = 0x7f0d0200;
    public static final int eg = 0x7f0d0287;
    public static final int eh = 0x7f0d0286;
    public static final int ei = 0x7f0d010f;
    public static final int ej = 0x7f0d0170;
    public static final int ek = 0x7f0d0053;
    public static final int el = 0x7f0d01a4;
    public static final int em = 0x7f0d00e1;
    public static final int en = 0x7f0d00df;
    public static final int eo = 0x7f0d0203;
    public static final int ep = 0x7f0d0192;
    public static final int eq = 0x7f0d01e2;
    public static final int er = 0x7f0d020b;
    public static final int es = 0x7f0d0161;
    public static final int et = 0x7f0d02ad;
    public static final int eu = 0x7f0d022e;
    public static final int ev = 0x7f0d01f1;
    public static final int ew = 0x7f0d01db;
    public static final int ex = 0x7f0d016e;
    public static final int ey = 0x7f0d016f;
    public static final int ez = 0x7f0d0311;
    public static boolean f = false;
    public static final int fA = 0x7f0d0179;
    public static final int fB = 0x7f0d0322;
    public static final int fC = 0x7f0d018c;
    public static final int fD = 0x7f0d00b6;
    public static final int fE = 0x7f0d025b;
    public static final int fF = 0x7f0d025e;
    public static final int fG = 0x7f0d012b;
    public static final int fH = 0x7f0d00ed;
    public static final int fI = 0x7f0d00e0;
    public static final int fJ = 0x7f0d0190;
    public static final int fK = 0x7f0d0327;
    public static final int fL = 0x7f0d02e3;
    public static final int fM = 0x7f0d02e2;
    public static final int fN = 0x7f0d02e1;
    public static final int fO = 0x7f0d02e4;
    public static final int fP = 0x7f0d02e5;
    public static final int fQ = 0x7f0d0134;
    public static final int fR = 0x7f0d0136;
    public static final int fS = 0x7f0d0135;
    public static final int fT = 0x7f0d012d;
    public static final int fU = 0x7f0d0158;
    public static final int fV = 0x7f0d01a5;
    public static final int fW = 0x7f0d02fb;
    public static final int fX = 0x7f0d012c;
    public static final int fY = 0x7f0d0169;
    public static final int fZ = 0x7f0d016a;
    public static final int fa = 0x7f0d0131;
    public static final int fb = 0x7f0d0174;
    public static final int fc = 0x7f0d027e;
    public static final int fd = 0x7f0d027d;
    public static final int fe = 0x7f0d027c;
    public static final int ff = 0x7f0d027b;
    public static final int fg = 0x7f0d0278;
    public static final int fh = 0x7f0d0279;
    public static final int fi = 0x7f0d020d;
    public static final int fj = 0x7f0d0166;
    public static final int fk = 0x7f0d034b;
    public static final int fl = 0x7f0d034f;
    public static final int fm = 0x7f0d02c7;
    public static final int fn = 0x7f0d01ff;
    public static final int fo = 0x7f0d023e;
    public static final int fp = 0x7f0d0202;
    public static final int fq = 0x7f0d0173;
    public static final int fr = 0x7f0d0321;
    public static final int fs = 0x7f0d025c;
    public static final int ft = 0x7f0d025d;
    public static final int fu = 0x7f0d0259;
    public static final int fv = 0x7f0d00dc;
    public static final int fw = 0x7f0d0165;
    public static final int fx = 0x7f0d018d;
    public static final int fy = 0x7f0d0178;
    public static final int fz = 0x7f0d0177;
    public static Field g;
    public static final int gA = 0x7f0d0051;
    public static final int gB = 0x7f0d0052;
    public static final int gC = 0x7f0d0343;
    public static final int gD = 0x7f0d00ea;
    public static final int gE = 0x7f0d014d;
    public static final int gF = 0x7f0d0257;
    public static final int gG = 0x7f0d031e;
    public static final int gH = 0x7f0d0191;
    public static final int gI = 0x7f0d0140;
    public static final int gJ = 0x7f0d0141;
    public static final int gK = 0x7f0a0142;
    public static final int gL = 0x7f0a0143;
    public static final int gM = 0x7f0a0141;
    public static final int gN = 0x7f0a0144;
    public static final int gO = 0x7f0d028b;
    public static final int gP = 0x7f0d0114;
    public static final int gQ = 0x7f0d028e;
    public static final int gR = 0x7f0d028d;
    public static final int gS = 0x7f0d028c;
    public static final int gT = 0x7f0d02b4;
    public static final int gU = 0x7f0d02b5;
    public static final int gV = 0x7f0d001a;
    public static final int gW = 0x7f08000f;
    public static final int gX = 0x7f080004;
    public static final int gY = 0x7f08000e;
    public static final int gZ = 0x7f0e028f;
    public static final int ga = 0x7f0d016b;
    public static final int gb = 0x7f0d016c;
    public static final int gc = 0x7f0d00d7;
    public static final int gd = 0x7f0d0189;
    public static final int ge = 0x7f0d025a;
    public static final int gf = 0x7f0d014c;
    public static final int gg = 0x7f0d0109;
    public static final int gh = 0x7f0d0081;
    public static final int gi = 0x7f0d0301;
    public static final int gj = 0x7f0d0221;
    public static final int gk = 0x7f0d0055;
    public static final int gl = 0x7f0d031d;
    public static final int gm = 0x7f0d0317;
    public static final int gn = 0x7f0d031c;
    public static final int go = 0x7f0d0319;
    public static final int gp = 0x7f0d031b;
    public static final int gq = 0x7f0d0117;
    public static final int gr = 0x7f0d0308;
    public static final int gs = 0x7f0d0303;
    public static final int gt = 0x7f0d0305;
    public static final int gu = 0x7f0d0188;
    public static final int gv = 0x7f0d01dd;
    public static final int gw = 0x7f0d00f9;
    public static final int gx = 0x7f0d0225;
    public static final int gy = 0x7f0d0149;
    public static final int gz = 0x7f0d0246;
    public static boolean h = false;
    public static final int hA = 0x7f0a00ce;
    public static final int hB = 0x7f0a00cf;
    public static final int hC = 0x7f0a00c7;
    public static final int hD = 0x7f0a00cd;
    public static final int hE = 0x7f0a00cc;
    public static final int hF = 0x7f0a00cb;
    public static final int hG = 0x7f0a00b5;
    public static final int hH = 0x7f0a00c5;
    public static final int hI = 0x7f0a00c4;
    public static final int hJ = 0x7f0a00b4;
    public static final int hK = 0x7f0a00c8;
    public static final int hL = 0x7f0a00c9;
    public static final int hM = 0x7f0a00ca;
    public static final int hN = 0x7f0a00b2;
    public static final int hO = 0x7f0a00c0;
    public static final int hP = 0x7f0a00c1;
    public static final int hQ = 0x7f0a00b3;
    public static final int hR = 0x7f0a00b9;
    public static final int hS = 0x7f0a00b8;
    public static final int hT = 0x7f0a00c2;
    public static final int hU = 0x7f0a00c3;
    public static final int hV = 0x7f0a00ba;
    public static final int hW = 0x7f0a00bb;
    public static final int hX = 0x7f0a00bc;
    public static final int hY = 0x7f0a00be;
    public static final int hZ = 0x7f0a00bd;
    public static final int ha = 0x7f0e0290;
    public static final int hb = 0x7f0e00d0;
    public static final int hc = 0x7f02045f;
    public static final int hd = 0x7f02062d;
    public static final int he = 0x7f0e0078;
    public static final int hf = 0x7f0e005f;
    public static final int hg = 0x7f0d00cf;
    public static final int hh = 0x7f0d00d0;
    public static final int hi = 0x7f0d01c2;
    public static final int hj = 0x7f0d02f2;
    public static final int hk = 0x7f0d02f3;
    public static final int hl = 0x7f0d02f5;
    public static final int hm = 0x7f0e00a6;
    public static final int hn = 0x7f020594;
    public static final int ho = 0x7f0205ab;
    public static final int hp = 0x7f0205b5;
    public static final int hq = 0x7f0205e8;
    public static final int hr = 0x7f0205fa;
    public static final int hs = 0x7f02060c;
    public static final int ht = 0x7f040085;
    public static final int hu = 0x7f0400fb;
    public static final int hv = 0x7f0400fc;
    public static final int hw = 0x7f0a00b6;
    public static final int hx = 0x7f0a00b7;
    public static final int hy = 0x7f0a00d0;
    public static final int hz = 0x7f0a00d1;
    public static Method i;
    public static final int iA = 0x7f0a007e;
    public static final int iB = 0x7f0a0062;
    public static final int iC = 0x7f0a006f;
    public static final int iD = 0x7f0a006a;
    public static final int iE = 0x7f0a00f8;
    public static final int iF = 0x7f0a0081;
    public static final int iG = 0x7f0a0080;
    public static final int iH = 0x7f0a0068;
    public static final int iI = 0x7f0a0069;
    public static final int iJ = 0x7f0a007c;
    public static final int iK = 0x7f0a0060;
    public static final int iL = 0x7f0a007a;
    public static final int iM = 0x7f0a007b;
    public static final int iN = 0x7f0a0079;
    public static final int iO = 0x7f0a0071;
    public static final int iP = 0x7f0a0070;
    public static final int iQ = 0x7f0a0076;
    public static final int iR = 0x7f0a0077;
    public static final int iS = 0x7f0a006b;
    public static final int iT = 0x7f0a006c;
    public static final int iU = 0x7f0a0066;
    public static final int iV = 0x7f0a00f9;
    public static final int iW = 0x7f0a00fb;
    public static final int iX = 0x7f0a00fa;
    public static final int iY = 0x7f0e00d1;
    public static final int iZ = 0x7f0e00d3;
    public static final int ia = 0x7f0a00bf;
    public static final int ib = 0x7f0e0015;
    public static final int ic = 0x7f0a0097;
    public static final int id = 0x7f0a00a5;
    public static final int ie = 0x7f0a009c;
    public static final int _fldif = 0x7f0a00a8;
    public static final int ig = 0x7f0a00a3;
    public static final int ih = 0x7f0a00a6;
    public static final int ii = 0x7f0a00a4;
    public static final int ij = 0x7f0a00a7;
    public static final int ik = 0x7f0a00a0;
    public static final int il = 0x7f0a00a1;
    public static final int im = 0x7f0a009e;
    public static final int in = 0x7f0a009f;
    public static final int io = 0x7f0a00a2;
    public static final int ip = 0x7f0a009d;
    public static final int iq = 0x7f0a009a;
    public static final int ir = 0x7f0a009b;
    public static final int is = 0x7f0a0168;
    public static final int it = 0x7f0e012d;
    public static final int iu = 0x7f0e012e;
    public static final int iv = 0x7f0d00c9;
    public static final int iw = 0x7f0d00ca;
    public static final int ix = 0x7f0d0242;
    public static final int iy = 0x7f0d02b3;
    public static final int iz = 0x7f0a0106;
    public static boolean j = false;
    public static final int ja = 0x7f04006c;
    public static final int jb = 0x7f0400b7;
    public static final int jc = 0x7f0400b5;
    public static final int jd = 0x7f04001e;
    public static final int je = 0x7f040025;
    public static final int jf = 0x7f040029;
    public static final int jg = 0x7f0400bf;
    public static final int jh = 0x7f0400f6;
    public static final int ji = 0x7f040104;
    public static final int jj = 0x7f040105;
    public static final int jk = 0x7f0b0070;
    public static final int jl = 0x7f0b0072;
    public static final int jm = 0x7f0b0071;
    public static final int jn = 0x7f0b0073;
    public static final int jo = 0x7f0b006f;
    public static final int jp = 0x7f0e007d;
    public static final int jq = 0x7f0c0000;
    public static final int jr = 0x7f04006b;
    public static Method js;
    public static final int k = 0x7f0d0218;
    public static final int l = 0x7f0d00b8;
    public static final int m = 0x7f0d00b9;
    public static final int n = 0x7f0d00a5;
    public static final int o = 0x7f0d02ca;
    public static final int p = 0x7f0d02ce;
    public static final int q = 0x7f0d02c5;
    public static final int r = 0x7f0d02c9;
    public static final int s = 0x7f0d020c;
    public static final int t = 0x7f0d0323;
    public static final int u = 0x7f0d00d8;
    public static final int v = 0x7f0d0172;
    public static final int w = 0x7f0d0253;
    public static final int x = 0x7f0d024d;
    public static final int y = 0x7f0d0139;
    public static final int z = 0x7f0d00de;
    private final List jt;
    private String ju;
    private dl jv;
    private PendingIntent jw;
    private PendingIntent jx;
    private long jy;

    public h()
    {
    }

    public h(String s1)
    {
        jt = new ArrayList();
        ju = s1;
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
            throw new NullPointerException();
        } else
        {
            return obj;
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
            return new ArrayList(jrk.a(iterable));
        } else
        {
            return a(iterable.iterator());
        }
    }

    public static ArrayList a(Iterator iterator)
    {
        ArrayList arraylist = new ArrayList();
        jts.a(arraylist, iterator);
        return arraylist;
    }

    public static transient ArrayList a(Object aobj[])
    {
        n.b(((Object) (aobj)));
        int i1 = aobj.length;
        g.c(i1, "arraySize");
        long l1 = i1;
        ArrayList arraylist = new ArrayList(g.e((long)(i1 / 10) + (5L + l1)));
        Collections.addAll(arraylist, aobj);
        return arraylist;
    }

    public static HashSet a(int i1)
    {
        return new HashSet(jwd.b(i1));
    }

    public static void a(int i1, long l1, int j1, cab cab1)
    {
        Object obj1 = null;
        if (l1 <= 0L)
        {
            return;
        }
        jlt jlt1 = new jlt();
        long l2 = cab1.a;
        Object obj;
        if (l2 == 0L)
        {
            obj = null;
        } else
        {
            obj = new jls();
            obj.a = Long.valueOf(l2);
        }
        jlt1.d = ((jls) (obj));
        obj = new jlz();
        obj.a = Integer.valueOf(18);
        obj.r = Integer.valueOf(1);
        obj.d = Integer.valueOf(cab1.p);
        obj.t = Long.valueOf(l1);
        obj.f = Integer.valueOf(j1);
        obj.C = cab1.j;
        obj.y = Long.toString(def.a());
        if (cab1.g != null)
        {
            obj.p = Long.valueOf(aow.d(cab1.g));
        }
        if (cab1.i > 0L)
        {
            obj.B = Long.valueOf(cab1.i);
        }
        if (cab1.c > 0 || cab1.e > 0 || cab1.d > 0L)
        {
            obj.v = new jlv();
            if (cab1.c > 0)
            {
                ((jlz) (obj)).v.d = Integer.valueOf(cab1.c);
            }
            if (cab1.e > 0)
            {
                ((jlz) (obj)).v.h = Integer.valueOf(cab1.e);
            }
            if (cab1.d > 0L)
            {
                ((jlz) (obj)).v.i = Long.valueOf(cab1.d);
            }
        }
        if (cab1.h != null)
        {
            obj.x = new jma();
            ((jlz) (obj)).x.a = cab1.h;
        }
        if (cab1.b != null)
        {
            obj.b = new jmb();
            ((jlz) (obj)).b.a = cab1.b;
        }
        if (cab1.m != null)
        {
            jly jly1 = new jly();
            jly1.a = cab1.m;
            jly1.b = Integer.valueOf(cab1.n);
            jly1.c = Integer.valueOf(cab1.o);
            obj.z = new jly[1];
            ((jlz) (obj)).z[0] = jly1;
        }
        if (j1 == 2 || j1 == 5)
        {
            gfh gfh1 = (gfh)hlp.a(g.nU, gfh);
            obj.A = new jlx();
            ((jlz) (obj)).A.a = Integer.valueOf(gfh1.a());
        }
        jlt1.b = ((jlz) (obj));
        if (cab1.k == null && cab1.l == null && cab1.f == null && cab1.q == null)
        {
            cab1 = obj1;
        } else
        {
            jkz jkz1 = new jkz();
            if (cab1.f != null)
            {
                jkz1.f = new jla();
                jkz1.f.a = cab1.f;
            }
            if (cab1.l != null || cab1.k != null)
            {
                jkz1.a = new jlc();
                if (cab1.l != null)
                {
                    jkz1.a.g = Boolean.valueOf(g.a(cab1.l, false));
                }
                if (cab1.k != null)
                {
                    jkz1.a.a = Boolean.valueOf(aow.a(cab1.k.a));
                    jkz1.a.b = Boolean.valueOf(cab1.k.b);
                    jkz1.a.c = Boolean.valueOf(cab1.k.c);
                    jkz1.a.d = Integer.valueOf(cab1.k.g);
                    jkz1.a.h = Long.valueOf(cab1.k.i);
                    jkz1.a.i = Long.valueOf(cab1.k.j);
                    jkz1.a.j = Long.valueOf(cab1.k.k);
                    jkz1.b = new jlb();
                    jkz1.b.a = Boolean.valueOf(cab1.k.e);
                    jlb jlb1 = jkz1.b;
                    boolean flag;
                    if (!cab1.k.h)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    jlb1.b = Boolean.valueOf(flag);
                    jkz1.c = new jle();
                    jkz1.c.a = Boolean.valueOf(cab1.k.d);
                    jkz1.c.b = Integer.valueOf(cab1.k.f);
                }
            }
            jkz1.e = cab1.q;
            cab1 = jkz1;
        }
        jlt1.c = cab1;
        if ((j1 == 2 || j1 == 1) && i1 != -1)
        {
            cab1 = dcz.S(i1);
            if (cab1.length != 0)
            {
                if (jlt1.a == null)
                {
                    jlt1.a = new jll();
                }
                if (jlt1.a.k == null)
                {
                    jlt1.a.k = new jlj();
                }
                jlt1.a.k.b = cab1;
            }
        }
        ((gdd)hlp.a(g.nU, gdd)).a(i1).a(jlt1);
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
        if (js == null)
        {
            try
            {
                js = ap1.getClass().getMethod("noteStateNotSaved", new Class[0]);
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                b();
            }
        }
        try
        {
            ((Method)g.e(js)).invoke(ap1, new Object[0]);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ap ap1)
        {
            b();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ap ap1)
        {
            b();
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

    public static void a(lni lni1, int i1, int j1, int k1)
    {
        if (i1 < j1 || i1 > k1)
        {
            throw new lnu(lni1.a(), Integer.valueOf(i1), Integer.valueOf(j1), Integer.valueOf(k1));
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

    public static boolean a(Object obj, Object obj1)
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
        if (collection instanceof jww)
        {
            obj = ((jww)collection).a();
        }
        if ((obj instanceof Set) && ((Collection) (obj)).size() > set.size())
        {
            return jts.a(set.iterator(), ((Collection) (obj)));
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

    public static LinkedList b(Iterable iterable)
    {
        LinkedList linkedlist = new LinkedList();
        if (iterable instanceof Collection)
        {
            linkedlist.addAll(jrk.a(iterable));
            return linkedlist;
        } else
        {
            jts.a(linkedlist, ((Iterable)n.b(iterable)).iterator());
            return linkedlist;
        }
    }

    private static void b()
    {
        throw new IllegalStateException("Could not access method FragmentManager#noteStateNotSaved");
    }

    public g a()
    {
        String as1[] = (String[])jt.toArray(new String[jt.size()]);
        String s1 = ju;
        dl dl1 = jv;
        PendingIntent pendingintent = jx;
        PendingIntent pendingintent1 = jw;
        long l1 = jy;
        return new g(as1, dl1, pendingintent, pendingintent1, new String[] {
            s1
        }, l1);
    }

    public h a(long l1)
    {
        jy = l1;
        return this;
    }

    public h a(PendingIntent pendingintent)
    {
        jw = pendingintent;
        return this;
    }

    public h a(PendingIntent pendingintent, dl dl1)
    {
        jv = dl1;
        jx = pendingintent;
        return this;
    }

    public h a(String s1)
    {
        jt.add(s1);
        return this;
    }

    public void a(int i1, aoa aoa, did did)
    {
        gdv.b();
    }
}
