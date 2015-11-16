// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hyn extends koj
{

    private static volatile hyn aS[];
    public Integer A;
    public Boolean B;
    public String C;
    public iar D;
    public Boolean E;
    public Boolean F;
    public Boolean G;
    public Boolean H;
    public Boolean I;
    public hyk J;
    public ibf K;
    public hyl L;
    public kpk M;
    public hyl N;
    public String O;
    public hyh P;
    public hyi Q;
    public Long R;
    public Long S;
    public Boolean T;
    public kqe U[];
    public hzi V[];
    public ias W[];
    public String X;
    public Boolean Y;
    public Integer Z;
    public String a;
    public String aA;
    public Boolean aB;
    public iag aC;
    public Boolean aD;
    public int aE[];
    public Boolean aF;
    public Integer aG;
    public Integer aH;
    public Boolean aI;
    public hzf aJ[];
    public String aK[];
    public Boolean aL;
    public hzd aM[];
    public Boolean aN;
    public Integer aO;
    public hyj aP[];
    public Boolean aQ;
    public hym aR;
    public Long aa;
    public Integer ab;
    public String ac[];
    public String ad[];
    public kpk ae;
    public iaw af;
    public iav ag[];
    public iau ah;
    public Long ai;
    public Boolean aj;
    public Boolean ak;
    public String al;
    public Integer am;
    public Integer an;
    public Integer ao;
    public Integer ap;
    public Integer aq;
    public Integer ar;
    public Float as;
    public Float at;
    public Float au;
    public Boolean av;
    public Boolean aw;
    public Boolean ax;
    public String ay;
    public String az;
    public Integer b;
    public hyl c;
    public String d;
    public String e;
    public hyl f[];
    public String g;
    public String h;
    public String i;
    public String j;
    public hyr k[];
    public hyu l;
    public iaz m;
    public String n;
    public Integer o;
    public iig p;
    public hye q;
    public hyw r;
    public Long s;
    public String t;
    public Double u;
    public Long v;
    public hyg w[];
    public String x;
    public Double y;
    public Boolean z;

    public hyn()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = hyl.a();
        g = null;
        h = null;
        i = null;
        j = null;
        k = hyr.a();
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        s = null;
        t = null;
        u = null;
        v = null;
        w = hyg.a();
        x = null;
        y = null;
        z = null;
        A = null;
        B = null;
        C = null;
        D = null;
        E = null;
        F = null;
        G = null;
        H = null;
        I = null;
        J = null;
        K = null;
        L = null;
        M = null;
        N = null;
        O = null;
        P = null;
        Q = null;
        R = null;
        S = null;
        T = null;
        U = kqe.a();
        V = hzi.a();
        W = ias.a();
        X = null;
        Y = null;
        Z = null;
        aa = null;
        ab = null;
        ac = kou.f;
        ad = kou.f;
        ae = null;
        af = null;
        ag = iav.a();
        ah = null;
        ai = null;
        aj = null;
        ak = null;
        al = null;
        am = null;
        an = null;
        ao = null;
        ap = null;
        aq = null;
        ar = null;
        as = null;
        at = null;
        au = null;
        av = null;
        aw = null;
        ax = null;
        ay = null;
        az = null;
        aA = null;
        aB = null;
        aC = null;
        aD = null;
        aE = kou.a;
        aF = null;
        aG = null;
        aH = null;
        aI = null;
        aJ = hzf.a();
        aK = kou.f;
        aL = null;
        aM = hzd.a();
        aN = null;
        aO = null;
        aP = hyj.a();
        aQ = null;
        aR = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static hyn[] a()
    {
        if (aS == null)
        {
            synchronized (kon.a)
            {
                if (aS == null)
                {
                    aS = new hyn[0];
                }
            }
        }
        return aS;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (a != null)
        {
            i1 = j1 + koh.b(1, a);
        }
        j1 = i1 + koh.e(2, b.intValue());
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + koh.d(3, c);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1;
            if (f.length > 0)
            {
                for (j1 = 0; j1 < f.length;)
                {
                    hyl hyl1 = f[j1];
                    int k1 = i1;
                    if (hyl1 != null)
                    {
                        k1 = i1 + koh.d(4, hyl1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        int l1 = j1;
        if (g != null)
        {
            l1 = j1 + koh.b(5, g);
        }
        i1 = l1;
        if (h != null)
        {
            i1 = l1 + koh.b(6, h);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1;
            if (k.length > 0)
            {
                for (j1 = 0; j1 < k.length;)
                {
                    hyr hyr1 = k[j1];
                    l1 = i1;
                    if (hyr1 != null)
                    {
                        l1 = i1 + koh.d(7, hyr1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + koh.d(8, l);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + koh.b(9, n);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + koh.e(10, o.intValue());
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + koh.d(11, p);
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + koh.d(12, q);
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1 + koh.d(13, r);
        }
        i1 = j1;
        if (s != null)
        {
            i1 = j1 + koh.e(14, s.longValue());
        }
        j1 = i1;
        if (t != null)
        {
            j1 = i1 + koh.b(15, t);
        }
        i1 = j1;
        if (u != null)
        {
            u.doubleValue();
            i1 = j1 + (koh.f(16) + 8);
        }
        j1 = i1;
        if (w != null)
        {
            j1 = i1;
            if (w.length > 0)
            {
                for (j1 = 0; j1 < w.length;)
                {
                    hyg hyg1 = w[j1];
                    l1 = i1;
                    if (hyg1 != null)
                    {
                        l1 = i1 + koh.d(18, hyg1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (x != null)
        {
            i1 = j1 + koh.b(19, x);
        }
        j1 = i1;
        if (y != null)
        {
            y.doubleValue();
            j1 = i1 + (koh.f(20) + 8);
        }
        i1 = j1;
        if (z != null)
        {
            z.booleanValue();
            i1 = j1 + (koh.f(21) + 1);
        }
        j1 = i1;
        if (E != null)
        {
            E.booleanValue();
            j1 = i1 + (koh.f(22) + 1);
        }
        i1 = j1;
        if (I != null)
        {
            I.booleanValue();
            i1 = j1 + (koh.f(23) + 1);
        }
        j1 = i1;
        if (J != null)
        {
            j1 = i1 + koh.d(24, J);
        }
        i1 = j1;
        if (K != null)
        {
            i1 = j1 + koh.d(25, K);
        }
        j1 = i1;
        if (L != null)
        {
            j1 = i1 + koh.d(26, L);
        }
        i1 = j1;
        if (F != null)
        {
            F.booleanValue();
            i1 = j1 + (koh.f(27) + 1);
        }
        j1 = i1;
        if (H != null)
        {
            H.booleanValue();
            j1 = i1 + (koh.f(28) + 1);
        }
        i1 = j1;
        if (O != null)
        {
            i1 = j1 + koh.b(29, O);
        }
        j1 = i1;
        if (P != null)
        {
            j1 = i1 + koh.d(30, P);
        }
        i1 = j1;
        if (Q != null)
        {
            i1 = j1 + koh.d(31, Q);
        }
        j1 = i1;
        if (R != null)
        {
            j1 = i1 + koh.e(32, R.longValue());
        }
        i1 = j1;
        if (S != null)
        {
            i1 = j1 + koh.e(33, S.longValue());
        }
        j1 = i1;
        if (T != null)
        {
            T.booleanValue();
            j1 = i1 + (koh.f(34) + 1);
        }
        l1 = j1;
        if (A != null)
        {
            l1 = j1 + koh.e(35, A.intValue());
        }
        i1 = l1;
        if (B != null)
        {
            B.booleanValue();
            i1 = l1 + (koh.f(36) + 1);
        }
        j1 = i1;
        if (U != null)
        {
            j1 = i1;
            if (U.length > 0)
            {
                for (j1 = 0; j1 < U.length;)
                {
                    kqe kqe1 = U[j1];
                    l1 = i1;
                    if (kqe1 != null)
                    {
                        l1 = i1 + koh.d(37, kqe1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (X != null)
        {
            i1 = j1 + koh.b(38, X);
        }
        j1 = i1;
        if (Y != null)
        {
            Y.booleanValue();
            j1 = i1 + (koh.f(39) + 1);
        }
        i1 = j1;
        if (aj != null)
        {
            aj.booleanValue();
            i1 = j1 + (koh.f(40) + 1);
        }
        j1 = i1;
        if (Z != null)
        {
            j1 = i1 + koh.e(42, Z.intValue());
        }
        l1 = j1;
        if (aa != null)
        {
            l1 = j1 + koh.e(43, aa.longValue());
        }
        i1 = l1;
        if (ab != null)
        {
            i1 = l1 + koh.e(44, ab.intValue());
        }
        j1 = i1;
        if (ac != null)
        {
            j1 = i1;
            if (ac.length > 0)
            {
                j1 = 0;
                l1 = 0;
                int l2;
                int k3;
                for (l2 = 0; j1 < ac.length; l2 = k3)
                {
                    String s1 = ac[j1];
                    int j4 = l1;
                    k3 = l2;
                    if (s1 != null)
                    {
                        k3 = l2 + 1;
                        j4 = l1 + koh.a(s1);
                    }
                    j1++;
                    l1 = j4;
                }

                j1 = i1 + l1 + l2 * 2;
            }
        }
        i1 = j1;
        if (ad != null)
        {
            i1 = j1;
            if (ad.length > 0)
            {
                i1 = 0;
                l1 = 0;
                int i3;
                int l3;
                for (i3 = 0; i1 < ad.length; i3 = l3)
                {
                    String s2 = ad[i1];
                    int k4 = l1;
                    l3 = i3;
                    if (s2 != null)
                    {
                        l3 = i3 + 1;
                        k4 = l1 + koh.a(s2);
                    }
                    i1++;
                    l1 = k4;
                }

                i1 = j1 + l1 + i3 * 2;
            }
        }
        j1 = i1;
        if (ae != null)
        {
            j1 = i1 + koh.d(47, ae);
        }
        i1 = j1;
        if (af != null)
        {
            i1 = j1 + koh.d(48, af);
        }
        j1 = i1;
        if (ah != null)
        {
            j1 = i1 + koh.d(49, ah);
        }
        i1 = j1;
        if (ai != null)
        {
            i1 = j1 + koh.e(50, ai.longValue());
        }
        j1 = i1;
        if (al != null)
        {
            j1 = i1 + koh.b(51, al);
        }
        i1 = j1;
        if (am != null)
        {
            i1 = j1 + koh.e(52, am.intValue());
        }
        j1 = i1;
        if (an != null)
        {
            j1 = i1 + koh.e(53, an.intValue());
        }
        i1 = j1;
        if (ao != null)
        {
            i1 = j1 + koh.e(54, ao.intValue());
        }
        j1 = i1;
        if (ap != null)
        {
            j1 = i1 + koh.e(55, ap.intValue());
        }
        i1 = j1;
        if (aq != null)
        {
            i1 = j1 + koh.e(56, aq.intValue());
        }
        j1 = i1;
        if (ar != null)
        {
            j1 = i1 + koh.e(57, ar.intValue());
        }
        i1 = j1;
        if (av != null)
        {
            av.booleanValue();
            i1 = j1 + (koh.f(58) + 1);
        }
        j1 = i1;
        if (aw != null)
        {
            aw.booleanValue();
            j1 = i1 + (koh.f(59) + 1);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + koh.b(60, i);
        }
        j1 = i1;
        if (ax != null)
        {
            ax.booleanValue();
            j1 = i1 + (koh.f(61) + 1);
        }
        i1 = j1;
        if (C != null)
        {
            i1 = j1 + koh.b(62, C);
        }
        j1 = i1;
        if (ay != null)
        {
            j1 = i1 + koh.b(63, ay);
        }
        i1 = j1;
        if (aB != null)
        {
            aB.booleanValue();
            i1 = j1 + (koh.f(64) + 1);
        }
        j1 = i1;
        if (V != null)
        {
            j1 = i1;
            if (V.length > 0)
            {
                for (j1 = 0; j1 < V.length;)
                {
                    hzi hzi1 = V[j1];
                    l1 = i1;
                    if (hzi1 != null)
                    {
                        l1 = i1 + koh.d(65, hzi1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (aC != null)
        {
            i1 = j1 + koh.d(66, aC);
        }
        j1 = i1;
        if (ag != null)
        {
            j1 = i1;
            if (ag.length > 0)
            {
                for (j1 = 0; j1 < ag.length;)
                {
                    iav iav1 = ag[j1];
                    l1 = i1;
                    if (iav1 != null)
                    {
                        l1 = i1 + koh.d(67, iav1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (aD != null)
        {
            aD.booleanValue();
            i1 = j1 + (koh.f(68) + 1);
        }
        j1 = i1;
        if (aF != null)
        {
            aF.booleanValue();
            j1 = i1 + (koh.f(69) + 1);
        }
        i1 = j1;
        if (M != null)
        {
            i1 = j1 + koh.d(70, M);
        }
        j1 = i1;
        if (aG != null)
        {
            j1 = i1 + koh.e(71, aG.intValue());
        }
        l1 = j1;
        if (aI != null)
        {
            aI.booleanValue();
            l1 = j1 + (koh.f(72) + 1);
        }
        i1 = l1;
        if (G != null)
        {
            G.booleanValue();
            i1 = l1 + (koh.f(73) + 1);
        }
        j1 = i1;
        if (aJ != null)
        {
            j1 = i1;
            if (aJ.length > 0)
            {
                for (j1 = 0; j1 < aJ.length;)
                {
                    hzf hzf1 = aJ[j1];
                    l1 = i1;
                    if (hzf1 != null)
                    {
                        l1 = i1 + koh.d(74, hzf1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (aK != null)
        {
            i1 = j1;
            if (aK.length > 0)
            {
                i1 = 0;
                l1 = 0;
                int j3;
                int i4;
                for (j3 = 0; i1 < aK.length; j3 = i4)
                {
                    String s3 = aK[i1];
                    int l4 = l1;
                    i4 = j3;
                    if (s3 != null)
                    {
                        i4 = j3 + 1;
                        l4 = l1 + koh.a(s3);
                    }
                    i1++;
                    l1 = l4;
                }

                i1 = j1 + l1 + j3 * 2;
            }
        }
        j1 = i1;
        if (aE != null)
        {
            j1 = i1;
            if (aE.length > 0)
            {
                j1 = 0;
                l1 = 0;
                for (; j1 < aE.length; j1++)
                {
                    l1 += koh.e(aE[j1]);
                }

                j1 = i1 + l1 + aE.length * 2;
            }
        }
        l1 = j1;
        if (aL != null)
        {
            aL.booleanValue();
            l1 = j1 + (koh.f(77) + 1);
        }
        i1 = l1;
        if (N != null)
        {
            i1 = l1 + koh.d(78, N);
        }
        j1 = i1;
        if (aM != null)
        {
            j1 = i1;
            if (aM.length > 0)
            {
                for (j1 = 0; j1 < aM.length;)
                {
                    hzd hzd1 = aM[j1];
                    int i2 = i1;
                    if (hzd1 != null)
                    {
                        i2 = i1 + koh.d(79, hzd1);
                    }
                    j1++;
                    i1 = i2;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (D != null)
        {
            i1 = j1 + koh.d(80, D);
        }
        j1 = i1;
        if (aN != null)
        {
            aN.booleanValue();
            j1 = i1 + (koh.f(81) + 1);
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + koh.b(82, d);
        }
        j1 = i1;
        if (aO != null)
        {
            j1 = i1 + koh.e(83, aO.intValue());
        }
        i1 = j1;
        if (aP != null)
        {
            i1 = j1;
            if (aP.length > 0)
            {
                i1 = j1;
                for (j1 = 0; j1 < aP.length;)
                {
                    hyj hyj1 = aP[j1];
                    int j2 = i1;
                    if (hyj1 != null)
                    {
                        j2 = i1 + koh.d(84, hyj1);
                    }
                    j1++;
                    i1 = j2;
                }

            }
        }
        j1 = i1;
        if (W != null)
        {
            j1 = i1;
            if (W.length > 0)
            {
                int k2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (k2 >= W.length)
                    {
                        break;
                    }
                    ias ias1 = W[k2];
                    j1 = i1;
                    if (ias1 != null)
                    {
                        j1 = i1 + koh.d(85, ias1);
                    }
                    k2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + koh.d(86, m);
        }
        j1 = i1;
        if (az != null)
        {
            j1 = i1 + koh.b(87, az);
        }
        i1 = j1;
        if (aA != null)
        {
            i1 = j1 + koh.b(88, aA);
        }
        j1 = i1;
        if (as != null)
        {
            as.floatValue();
            j1 = i1 + (koh.f(89) + 4);
        }
        i1 = j1;
        if (at != null)
        {
            at.floatValue();
            i1 = j1 + (koh.f(90) + 4);
        }
        j1 = i1;
        if (au != null)
        {
            au.floatValue();
            j1 = i1 + (koh.f(91) + 4);
        }
        i1 = j1;
        if (ak != null)
        {
            ak.booleanValue();
            i1 = j1 + (koh.f(92) + 1);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + koh.b(93, e);
        }
        i1 = j1;
        if (v != null)
        {
            i1 = j1 + koh.e(94, v.longValue());
        }
        j1 = i1;
        if (aQ != null)
        {
            aQ.booleanValue();
            j1 = i1 + (koh.f(95) + 1);
        }
        i1 = j1;
        if (aH != null)
        {
            i1 = j1 + koh.e(96, aH.intValue());
        }
        j1 = i1;
        if (aR != null)
        {
            j1 = i1 + koh.d(97, aR);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + koh.b(98, j);
        }
        return i1;
    }

    public kop mergeFrom(kog kog1)
    {
_L100:
        int i1 = kog1.a();
        i1;
        JVM INSTR lookupswitch 98: default 804
    //                   0: 814
    //                   10: 816
    //                   16: 827
    //                   26: 879
    //                   34: 908
    //                   42: 1039
    //                   50: 1050
    //                   58: 1061
    //                   66: 1192
    //                   74: 1221
    //                   80: 1232
    //                   90: 1246
    //                   98: 1275
    //                   106: 1304
    //                   112: 1333
    //                   122: 1347
    //                   129: 1358
    //                   146: 1372
    //                   154: 1504
    //                   161: 1515
    //                   168: 1529
    //                   176: 1543
    //                   184: 1557
    //                   194: 1571
    //                   202: 1600
    //                   210: 1629
    //                   216: 1658
    //                   224: 1672
    //                   234: 1686
    //                   242: 1697
    //                   250: 1726
    //                   256: 1755
    //                   264: 1769
    //                   272: 1783
    //                   280: 1797
    //                   288: 1847
    //                   298: 1861
    //                   306: 1993
    //                   312: 2004
    //                   320: 2018
    //                   336: 2032
    //                   344: 2046
    //                   352: 2060
    //                   362: 2111
    //                   370: 2221
    //                   378: 2331
    //                   386: 2360
    //                   394: 2389
    //                   400: 2418
    //                   410: 2432
    //                   416: 2443
    //                   424: 2457
    //                   432: 2471
    //                   440: 2485
    //                   448: 2499
    //                   456: 2513
    //                   464: 2527
    //                   472: 2541
    //                   482: 2555
    //                   488: 2566
    //                   498: 2580
    //                   506: 2591
    //                   512: 2602
    //                   522: 2616
    //                   530: 2748
    //                   538: 2777
    //                   544: 2909
    //                   552: 2923
    //                   562: 2937
    //                   568: 2966
    //                   576: 3087
    //                   584: 3101
    //                   594: 3115
    //                   602: 3247
    //                   608: 3357
    //                   610: 3548
    //                   616: 3762
    //                   626: 3776
    //                   634: 3805
    //                   642: 3937
    //                   648: 3966
    //                   658: 3980
    //                   664: 3991
    //                   674: 4005
    //                   682: 4137
    //                   690: 4269
    //                   698: 4298
    //                   706: 4309
    //                   717: 4320
    //                   725: 4334
    //                   733: 4348
    //                   736: 4362
    //                   746: 4376
    //                   752: 4387
    //                   760: 4401
    //                   768: 4415
    //                   778: 4459
    //                   786: 4488;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40 _L41 _L42 _L43 _L44 _L45 _L46 _L47 _L48 _L49 _L50 _L51 _L52 _L53 _L54 _L55 _L56 _L57 _L58 _L59 _L60 _L61 _L62 _L63 _L64 _L65 _L66 _L67 _L68 _L69 _L70 _L71 _L72 _L73 _L74 _L75 _L76 _L77 _L78 _L79 _L80 _L81 _L82 _L83 _L84 _L85 _L86 _L87 _L88 _L89 _L90 _L91 _L92 _L93 _L94 _L95 _L96 _L97 _L98 _L99
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L100; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L100
_L4:
        i1 = kog1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            b = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (c == null)
        {
            c = new hyl();
        }
        kog1.a(c);
        continue; /* Loop/switch isn't completed */
_L6:
        int j2 = kou.b(kog1, 34);
        hyl ahyl[];
        if (f == null)
        {
            i1 = 0;
        } else
        {
            i1 = f.length;
        }
        ahyl = new hyl[j2 + i1];
        j2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(f, 0, ahyl, 0, i1);
            j2 = i1;
        }
        for (; j2 < ahyl.length - 1; j2++)
        {
            ahyl[j2] = new hyl();
            kog1.a(ahyl[j2]);
            kog1.a();
        }

        ahyl[j2] = new hyl();
        kog1.a(ahyl[j2]);
        f = ahyl;
        continue; /* Loop/switch isn't completed */
_L7:
        g = kog1.j();
        continue; /* Loop/switch isn't completed */
_L8:
        h = kog1.j();
        continue; /* Loop/switch isn't completed */
_L9:
        int k2 = kou.b(kog1, 58);
        hyr ahyr[];
        if (k == null)
        {
            i1 = 0;
        } else
        {
            i1 = k.length;
        }
        ahyr = new hyr[k2 + i1];
        k2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(k, 0, ahyr, 0, i1);
            k2 = i1;
        }
        for (; k2 < ahyr.length - 1; k2++)
        {
            ahyr[k2] = new hyr();
            kog1.a(ahyr[k2]);
            kog1.a();
        }

        ahyr[k2] = new hyr();
        kog1.a(ahyr[k2]);
        k = ahyr;
        continue; /* Loop/switch isn't completed */
_L10:
        if (l == null)
        {
            l = new hyu();
        }
        kog1.a(l);
        continue; /* Loop/switch isn't completed */
_L11:
        n = kog1.j();
        continue; /* Loop/switch isn't completed */
_L12:
        o = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L13:
        if (p == null)
        {
            p = new iig();
        }
        kog1.a(p);
        continue; /* Loop/switch isn't completed */
_L14:
        if (q == null)
        {
            q = new hye();
        }
        kog1.a(q);
        continue; /* Loop/switch isn't completed */
_L15:
        if (r == null)
        {
            r = new hyw();
        }
        kog1.a(r);
        continue; /* Loop/switch isn't completed */
_L16:
        s = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L17:
        t = kog1.j();
        continue; /* Loop/switch isn't completed */
_L18:
        u = Double.valueOf(kog1.b());
        continue; /* Loop/switch isn't completed */
_L19:
        int l2 = kou.b(kog1, 146);
        hyg ahyg[];
        if (w == null)
        {
            i1 = 0;
        } else
        {
            i1 = w.length;
        }
        ahyg = new hyg[l2 + i1];
        l2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(w, 0, ahyg, 0, i1);
            l2 = i1;
        }
        for (; l2 < ahyg.length - 1; l2++)
        {
            ahyg[l2] = new hyg();
            kog1.a(ahyg[l2]);
            kog1.a();
        }

        ahyg[l2] = new hyg();
        kog1.a(ahyg[l2]);
        w = ahyg;
        continue; /* Loop/switch isn't completed */
_L20:
        x = kog1.j();
        continue; /* Loop/switch isn't completed */
_L21:
        y = Double.valueOf(kog1.b());
        continue; /* Loop/switch isn't completed */
_L22:
        z = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L23:
        E = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L24:
        I = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L25:
        if (J == null)
        {
            J = new hyk();
        }
        kog1.a(J);
        continue; /* Loop/switch isn't completed */
_L26:
        if (K == null)
        {
            K = new ibf();
        }
        kog1.a(K);
        continue; /* Loop/switch isn't completed */
_L27:
        if (L == null)
        {
            L = new hyl();
        }
        kog1.a(L);
        continue; /* Loop/switch isn't completed */
_L28:
        F = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L29:
        H = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L30:
        O = kog1.j();
        continue; /* Loop/switch isn't completed */
_L31:
        if (P == null)
        {
            P = new hyh();
        }
        kog1.a(P);
        continue; /* Loop/switch isn't completed */
_L32:
        if (Q == null)
        {
            Q = new hyi();
        }
        kog1.a(Q);
        continue; /* Loop/switch isn't completed */
_L33:
        R = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L34:
        S = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L35:
        T = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L36:
        i1 = kog1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            A = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L37:
        B = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L38:
        int i3 = kou.b(kog1, 298);
        kqe akqe[];
        if (U == null)
        {
            i1 = 0;
        } else
        {
            i1 = U.length;
        }
        akqe = new kqe[i3 + i1];
        i3 = i1;
        if (i1 != 0)
        {
            System.arraycopy(U, 0, akqe, 0, i1);
            i3 = i1;
        }
        for (; i3 < akqe.length - 1; i3++)
        {
            akqe[i3] = new kqe();
            kog1.a(akqe[i3]);
            kog1.a();
        }

        akqe[i3] = new kqe();
        kog1.a(akqe[i3]);
        U = akqe;
        continue; /* Loop/switch isn't completed */
_L39:
        X = kog1.j();
        continue; /* Loop/switch isn't completed */
_L40:
        Y = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L41:
        aj = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L42:
        Z = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L43:
        aa = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L44:
        i1 = kog1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            ab = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L45:
        int j3 = kou.b(kog1, 362);
        String as1[];
        if (ac == null)
        {
            i1 = 0;
        } else
        {
            i1 = ac.length;
        }
        as1 = new String[j3 + i1];
        j3 = i1;
        if (i1 != 0)
        {
            System.arraycopy(ac, 0, as1, 0, i1);
            j3 = i1;
        }
        for (; j3 < as1.length - 1; j3++)
        {
            as1[j3] = kog1.j();
            kog1.a();
        }

        as1[j3] = kog1.j();
        ac = as1;
        continue; /* Loop/switch isn't completed */
_L46:
        int k3 = kou.b(kog1, 370);
        String as2[];
        if (ad == null)
        {
            i1 = 0;
        } else
        {
            i1 = ad.length;
        }
        as2 = new String[k3 + i1];
        k3 = i1;
        if (i1 != 0)
        {
            System.arraycopy(ad, 0, as2, 0, i1);
            k3 = i1;
        }
        for (; k3 < as2.length - 1; k3++)
        {
            as2[k3] = kog1.j();
            kog1.a();
        }

        as2[k3] = kog1.j();
        ad = as2;
        continue; /* Loop/switch isn't completed */
_L47:
        if (ae == null)
        {
            ae = new kpk();
        }
        kog1.a(ae);
        continue; /* Loop/switch isn't completed */
_L48:
        if (af == null)
        {
            af = new iaw();
        }
        kog1.a(af);
        continue; /* Loop/switch isn't completed */
_L49:
        if (ah == null)
        {
            ah = new iau();
        }
        kog1.a(ah);
        continue; /* Loop/switch isn't completed */
_L50:
        ai = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L51:
        al = kog1.j();
        continue; /* Loop/switch isn't completed */
_L52:
        am = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L53:
        an = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L54:
        ao = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L55:
        ap = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L56:
        aq = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L57:
        ar = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L58:
        av = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L59:
        aw = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L60:
        i = kog1.j();
        continue; /* Loop/switch isn't completed */
_L61:
        ax = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L62:
        C = kog1.j();
        continue; /* Loop/switch isn't completed */
_L63:
        ay = kog1.j();
        continue; /* Loop/switch isn't completed */
_L64:
        aB = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L65:
        int l3 = kou.b(kog1, 522);
        hzi ahzi[];
        if (V == null)
        {
            i1 = 0;
        } else
        {
            i1 = V.length;
        }
        ahzi = new hzi[l3 + i1];
        l3 = i1;
        if (i1 != 0)
        {
            System.arraycopy(V, 0, ahzi, 0, i1);
            l3 = i1;
        }
        for (; l3 < ahzi.length - 1; l3++)
        {
            ahzi[l3] = new hzi();
            kog1.a(ahzi[l3]);
            kog1.a();
        }

        ahzi[l3] = new hzi();
        kog1.a(ahzi[l3]);
        V = ahzi;
        continue; /* Loop/switch isn't completed */
_L66:
        if (aC == null)
        {
            aC = new iag();
        }
        kog1.a(aC);
        continue; /* Loop/switch isn't completed */
_L67:
        int i4 = kou.b(kog1, 538);
        iav aiav[];
        if (ag == null)
        {
            i1 = 0;
        } else
        {
            i1 = ag.length;
        }
        aiav = new iav[i4 + i1];
        i4 = i1;
        if (i1 != 0)
        {
            System.arraycopy(ag, 0, aiav, 0, i1);
            i4 = i1;
        }
        for (; i4 < aiav.length - 1; i4++)
        {
            aiav[i4] = new iav();
            kog1.a(aiav[i4]);
            kog1.a();
        }

        aiav[i4] = new iav();
        kog1.a(aiav[i4]);
        ag = aiav;
        continue; /* Loop/switch isn't completed */
_L68:
        aD = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L69:
        aF = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L70:
        if (M == null)
        {
            M = new kpk();
        }
        kog1.a(M);
        continue; /* Loop/switch isn't completed */
_L71:
        i1 = kog1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
            aG = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L72:
        aI = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L73:
        G = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L74:
        int j4 = kou.b(kog1, 594);
        hzf ahzf[];
        if (aJ == null)
        {
            i1 = 0;
        } else
        {
            i1 = aJ.length;
        }
        ahzf = new hzf[j4 + i1];
        j4 = i1;
        if (i1 != 0)
        {
            System.arraycopy(aJ, 0, ahzf, 0, i1);
            j4 = i1;
        }
        for (; j4 < ahzf.length - 1; j4++)
        {
            ahzf[j4] = new hzf();
            kog1.a(ahzf[j4]);
            kog1.a();
        }

        ahzf[j4] = new hzf();
        kog1.a(ahzf[j4]);
        aJ = ahzf;
        continue; /* Loop/switch isn't completed */
_L75:
        int k4 = kou.b(kog1, 602);
        String as3[];
        if (aK == null)
        {
            i1 = 0;
        } else
        {
            i1 = aK.length;
        }
        as3 = new String[k4 + i1];
        k4 = i1;
        if (i1 != 0)
        {
            System.arraycopy(aK, 0, as3, 0, i1);
            k4 = i1;
        }
        for (; k4 < as3.length - 1; k4++)
        {
            as3[k4] = kog1.j();
            kog1.a();
        }

        as3[k4] = kog1.j();
        aK = as3;
        continue; /* Loop/switch isn't completed */
_L76:
        int ai1[];
        int l4;
        int j6;
        j6 = kou.b(kog1, 608);
        ai1 = new int[j6];
        l4 = 0;
        i1 = 0;
_L106:
        if (l4 >= j6) goto _L102; else goto _L101
_L101:
        int k6;
        if (l4 != 0)
        {
            kog1.a();
        }
        k6 = kog1.f();
        k6;
        JVM INSTR tableswitch 0 3: default 3432
    //                   0 3441
    //                   1 3441
    //                   2 3441
    //                   3 3441;
           goto _L103 _L104 _L104 _L104 _L104
_L103:
        l4++;
        continue; /* Loop/switch isn't completed */
_L104:
        int l5 = i1 + 1;
        ai1[i1] = k6;
        i1 = l5;
        if (true) goto _L103; else goto _L102
_L102:
        if (i1 != 0)
        {
            if (aE == null)
            {
                l4 = 0;
            } else
            {
                l4 = aE.length;
            }
            if (l4 == 0 && i1 == ai1.length)
            {
                aE = ai1;
            } else
            {
                int ai2[] = new int[l4 + i1];
                if (l4 != 0)
                {
                    System.arraycopy(aE, 0, ai2, 0, l4);
                }
                System.arraycopy(ai1, 0, ai2, l4, i1);
                aE = ai2;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L106; else goto _L105
_L105:
_L77:
        int i6;
        i6 = kog1.c(kog1.p());
        i1 = kog1.r();
        l4 = 0;
_L112:
        if (kog1.q() > 0)
        {
            switch (kog1.f())
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                l4++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (l4 == 0) goto _L108; else goto _L107
_L107:
        kog1.e(i1);
        if (aE == null)
        {
            i1 = 0;
        } else
        {
            i1 = aE.length;
        }
        ai1 = new int[l4 + i1];
        l4 = i1;
        if (i1 != 0)
        {
            System.arraycopy(aE, 0, ai1, 0, i1);
            l4 = i1;
        }
_L110:
        if (kog1.q() > 0)
        {
            i1 = kog1.f();
            switch (i1)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                ai1[l4] = i1;
                l4++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        aE = ai1;
_L108:
        kog1.d(i6);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L110; else goto _L109
_L109:
        if (true) goto _L112; else goto _L111
_L111:
_L78:
        aL = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L79:
        if (N == null)
        {
            N = new hyl();
        }
        kog1.a(N);
        continue; /* Loop/switch isn't completed */
_L80:
        int i5 = kou.b(kog1, 634);
        hzd ahzd[];
        int j1;
        if (aM == null)
        {
            j1 = 0;
        } else
        {
            j1 = aM.length;
        }
        ahzd = new hzd[i5 + j1];
        i5 = j1;
        if (j1 != 0)
        {
            System.arraycopy(aM, 0, ahzd, 0, j1);
            i5 = j1;
        }
        for (; i5 < ahzd.length - 1; i5++)
        {
            ahzd[i5] = new hzd();
            kog1.a(ahzd[i5]);
            kog1.a();
        }

        ahzd[i5] = new hzd();
        kog1.a(ahzd[i5]);
        aM = ahzd;
        continue; /* Loop/switch isn't completed */
_L81:
        if (D == null)
        {
            D = new iar();
        }
        kog1.a(D);
        continue; /* Loop/switch isn't completed */
_L82:
        aN = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L83:
        d = kog1.j();
        continue; /* Loop/switch isn't completed */
_L84:
        aO = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L85:
        int j5 = kou.b(kog1, 674);
        hyj ahyj[];
        int k1;
        if (aP == null)
        {
            k1 = 0;
        } else
        {
            k1 = aP.length;
        }
        ahyj = new hyj[j5 + k1];
        j5 = k1;
        if (k1 != 0)
        {
            System.arraycopy(aP, 0, ahyj, 0, k1);
            j5 = k1;
        }
        for (; j5 < ahyj.length - 1; j5++)
        {
            ahyj[j5] = new hyj();
            kog1.a(ahyj[j5]);
            kog1.a();
        }

        ahyj[j5] = new hyj();
        kog1.a(ahyj[j5]);
        aP = ahyj;
        continue; /* Loop/switch isn't completed */
_L86:
        int k5 = kou.b(kog1, 682);
        ias aias[];
        int l1;
        if (W == null)
        {
            l1 = 0;
        } else
        {
            l1 = W.length;
        }
        aias = new ias[k5 + l1];
        k5 = l1;
        if (l1 != 0)
        {
            System.arraycopy(W, 0, aias, 0, l1);
            k5 = l1;
        }
        for (; k5 < aias.length - 1; k5++)
        {
            aias[k5] = new ias();
            kog1.a(aias[k5]);
            kog1.a();
        }

        aias[k5] = new ias();
        kog1.a(aias[k5]);
        W = aias;
        continue; /* Loop/switch isn't completed */
_L87:
        if (m == null)
        {
            m = new iaz();
        }
        kog1.a(m);
        continue; /* Loop/switch isn't completed */
_L88:
        az = kog1.j();
        continue; /* Loop/switch isn't completed */
_L89:
        aA = kog1.j();
        continue; /* Loop/switch isn't completed */
_L90:
        as = Float.valueOf(kog1.c());
        continue; /* Loop/switch isn't completed */
_L91:
        at = Float.valueOf(kog1.c());
        continue; /* Loop/switch isn't completed */
_L92:
        au = Float.valueOf(kog1.c());
        continue; /* Loop/switch isn't completed */
_L93:
        ak = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L94:
        e = kog1.j();
        continue; /* Loop/switch isn't completed */
_L95:
        v = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L96:
        aQ = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L97:
        int i2 = kog1.f();
        switch (i2)
        {
        case 0: // '\0'
        case 1: // '\001'
            aH = Integer.valueOf(i2);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L98:
        if (aR == null)
        {
            aR = new hym();
        }
        kog1.a(aR);
        continue; /* Loop/switch isn't completed */
_L99:
        j = kog1.j();
        if (true) goto _L100; else goto _L113
_L113:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.a(1, a);
        }
        koh1.a(2, b.intValue());
        if (c != null)
        {
            koh1.b(3, c);
        }
        if (f != null && f.length > 0)
        {
            for (int i1 = 0; i1 < f.length; i1++)
            {
                hyl hyl1 = f[i1];
                if (hyl1 != null)
                {
                    koh1.b(4, hyl1);
                }
            }

        }
        if (g != null)
        {
            koh1.a(5, g);
        }
        if (h != null)
        {
            koh1.a(6, h);
        }
        if (k != null && k.length > 0)
        {
            for (int j1 = 0; j1 < k.length; j1++)
            {
                hyr hyr1 = k[j1];
                if (hyr1 != null)
                {
                    koh1.b(7, hyr1);
                }
            }

        }
        if (l != null)
        {
            koh1.b(8, l);
        }
        if (n != null)
        {
            koh1.a(9, n);
        }
        if (o != null)
        {
            koh1.a(10, o.intValue());
        }
        if (p != null)
        {
            koh1.b(11, p);
        }
        if (q != null)
        {
            koh1.b(12, q);
        }
        if (r != null)
        {
            koh1.b(13, r);
        }
        if (s != null)
        {
            koh1.b(14, s.longValue());
        }
        if (t != null)
        {
            koh1.a(15, t);
        }
        if (u != null)
        {
            koh1.a(16, u.doubleValue());
        }
        if (w != null && w.length > 0)
        {
            for (int k1 = 0; k1 < w.length; k1++)
            {
                hyg hyg1 = w[k1];
                if (hyg1 != null)
                {
                    koh1.b(18, hyg1);
                }
            }

        }
        if (x != null)
        {
            koh1.a(19, x);
        }
        if (y != null)
        {
            koh1.a(20, y.doubleValue());
        }
        if (z != null)
        {
            koh1.a(21, z.booleanValue());
        }
        if (E != null)
        {
            koh1.a(22, E.booleanValue());
        }
        if (I != null)
        {
            koh1.a(23, I.booleanValue());
        }
        if (J != null)
        {
            koh1.b(24, J);
        }
        if (K != null)
        {
            koh1.b(25, K);
        }
        if (L != null)
        {
            koh1.b(26, L);
        }
        if (F != null)
        {
            koh1.a(27, F.booleanValue());
        }
        if (H != null)
        {
            koh1.a(28, H.booleanValue());
        }
        if (O != null)
        {
            koh1.a(29, O);
        }
        if (P != null)
        {
            koh1.b(30, P);
        }
        if (Q != null)
        {
            koh1.b(31, Q);
        }
        if (R != null)
        {
            koh1.b(32, R.longValue());
        }
        if (S != null)
        {
            koh1.b(33, S.longValue());
        }
        if (T != null)
        {
            koh1.a(34, T.booleanValue());
        }
        if (A != null)
        {
            koh1.a(35, A.intValue());
        }
        if (B != null)
        {
            koh1.a(36, B.booleanValue());
        }
        if (U != null && U.length > 0)
        {
            for (int l1 = 0; l1 < U.length; l1++)
            {
                kqe kqe1 = U[l1];
                if (kqe1 != null)
                {
                    koh1.b(37, kqe1);
                }
            }

        }
        if (X != null)
        {
            koh1.a(38, X);
        }
        if (Y != null)
        {
            koh1.a(39, Y.booleanValue());
        }
        if (aj != null)
        {
            koh1.a(40, aj.booleanValue());
        }
        if (Z != null)
        {
            koh1.a(42, Z.intValue());
        }
        if (aa != null)
        {
            koh1.b(43, aa.longValue());
        }
        if (ab != null)
        {
            koh1.a(44, ab.intValue());
        }
        if (ac != null && ac.length > 0)
        {
            for (int i2 = 0; i2 < ac.length; i2++)
            {
                String s1 = ac[i2];
                if (s1 != null)
                {
                    koh1.a(45, s1);
                }
            }

        }
        if (ad != null && ad.length > 0)
        {
            for (int j2 = 0; j2 < ad.length; j2++)
            {
                String s2 = ad[j2];
                if (s2 != null)
                {
                    koh1.a(46, s2);
                }
            }

        }
        if (ae != null)
        {
            koh1.b(47, ae);
        }
        if (af != null)
        {
            koh1.b(48, af);
        }
        if (ah != null)
        {
            koh1.b(49, ah);
        }
        if (ai != null)
        {
            koh1.b(50, ai.longValue());
        }
        if (al != null)
        {
            koh1.a(51, al);
        }
        if (am != null)
        {
            koh1.a(52, am.intValue());
        }
        if (an != null)
        {
            koh1.a(53, an.intValue());
        }
        if (ao != null)
        {
            koh1.a(54, ao.intValue());
        }
        if (ap != null)
        {
            koh1.a(55, ap.intValue());
        }
        if (aq != null)
        {
            koh1.a(56, aq.intValue());
        }
        if (ar != null)
        {
            koh1.a(57, ar.intValue());
        }
        if (av != null)
        {
            koh1.a(58, av.booleanValue());
        }
        if (aw != null)
        {
            koh1.a(59, aw.booleanValue());
        }
        if (i != null)
        {
            koh1.a(60, i);
        }
        if (ax != null)
        {
            koh1.a(61, ax.booleanValue());
        }
        if (C != null)
        {
            koh1.a(62, C);
        }
        if (ay != null)
        {
            koh1.a(63, ay);
        }
        if (aB != null)
        {
            koh1.a(64, aB.booleanValue());
        }
        if (V != null && V.length > 0)
        {
            for (int k2 = 0; k2 < V.length; k2++)
            {
                hzi hzi1 = V[k2];
                if (hzi1 != null)
                {
                    koh1.b(65, hzi1);
                }
            }

        }
        if (aC != null)
        {
            koh1.b(66, aC);
        }
        if (ag != null && ag.length > 0)
        {
            for (int l2 = 0; l2 < ag.length; l2++)
            {
                iav iav1 = ag[l2];
                if (iav1 != null)
                {
                    koh1.b(67, iav1);
                }
            }

        }
        if (aD != null)
        {
            koh1.a(68, aD.booleanValue());
        }
        if (aF != null)
        {
            koh1.a(69, aF.booleanValue());
        }
        if (M != null)
        {
            koh1.b(70, M);
        }
        if (aG != null)
        {
            koh1.a(71, aG.intValue());
        }
        if (aI != null)
        {
            koh1.a(72, aI.booleanValue());
        }
        if (G != null)
        {
            koh1.a(73, G.booleanValue());
        }
        if (aJ != null && aJ.length > 0)
        {
            for (int i3 = 0; i3 < aJ.length; i3++)
            {
                hzf hzf1 = aJ[i3];
                if (hzf1 != null)
                {
                    koh1.b(74, hzf1);
                }
            }

        }
        if (aK != null && aK.length > 0)
        {
            for (int j3 = 0; j3 < aK.length; j3++)
            {
                String s3 = aK[j3];
                if (s3 != null)
                {
                    koh1.a(75, s3);
                }
            }

        }
        if (aE != null && aE.length > 0)
        {
            for (int k3 = 0; k3 < aE.length; k3++)
            {
                koh1.a(76, aE[k3]);
            }

        }
        if (aL != null)
        {
            koh1.a(77, aL.booleanValue());
        }
        if (N != null)
        {
            koh1.b(78, N);
        }
        if (aM != null && aM.length > 0)
        {
            for (int l3 = 0; l3 < aM.length; l3++)
            {
                hzd hzd1 = aM[l3];
                if (hzd1 != null)
                {
                    koh1.b(79, hzd1);
                }
            }

        }
        if (D != null)
        {
            koh1.b(80, D);
        }
        if (aN != null)
        {
            koh1.a(81, aN.booleanValue());
        }
        if (d != null)
        {
            koh1.a(82, d);
        }
        if (aO != null)
        {
            koh1.a(83, aO.intValue());
        }
        if (aP != null && aP.length > 0)
        {
            for (int i4 = 0; i4 < aP.length; i4++)
            {
                hyj hyj1 = aP[i4];
                if (hyj1 != null)
                {
                    koh1.b(84, hyj1);
                }
            }

        }
        if (W != null && W.length > 0)
        {
            for (int j4 = ((flag) ? 1 : 0); j4 < W.length; j4++)
            {
                ias ias1 = W[j4];
                if (ias1 != null)
                {
                    koh1.b(85, ias1);
                }
            }

        }
        if (m != null)
        {
            koh1.b(86, m);
        }
        if (az != null)
        {
            koh1.a(87, az);
        }
        if (aA != null)
        {
            koh1.a(88, aA);
        }
        if (as != null)
        {
            koh1.a(89, as.floatValue());
        }
        if (at != null)
        {
            koh1.a(90, at.floatValue());
        }
        if (au != null)
        {
            koh1.a(91, au.floatValue());
        }
        if (ak != null)
        {
            koh1.a(92, ak.booleanValue());
        }
        if (e != null)
        {
            koh1.a(93, e);
        }
        if (v != null)
        {
            koh1.b(94, v.longValue());
        }
        if (aQ != null)
        {
            koh1.a(95, aQ.booleanValue());
        }
        if (aH != null)
        {
            koh1.a(96, aH.intValue());
        }
        if (aR != null)
        {
            koh1.b(97, aR);
        }
        if (j != null)
        {
            koh1.a(98, j);
        }
        super.writeTo(koh1);
    }
}
