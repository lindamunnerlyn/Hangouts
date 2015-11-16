// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.apps.hangouts.hangout.HangoutActivity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;

public final class bpd extends dgp
    implements bnc
{

    private static final int O[] = {
        1, 2
    };
    private static final int P[] = {
        1, 3
    };
    private static final boolean c = false;
    private boolean A;
    private final LinkedHashMap B;
    private int C;
    private boolean D;
    private boolean E;
    private int F;
    private String G;
    private String H;
    private String I;
    private boolean J;
    private boolean K;
    private final Random L;
    private jtd M;
    private int N;
    private final ceu Q;
    private final brz R;
    private String S;
    private boolean T;
    private gjl U;
    private final Runnable V;
    private final Runnable W;
    private final Runnable X;
    private final Runnable Y;
    private final Runnable Z;
    public final bnd a;
    private final bof b;
    private final boolean d;
    private boolean e;
    private int f;
    private final Handler g;
    private final boy h;
    private boy i;
    private final String j;
    private final String k;
    private final int l;
    private final int m;
    private final boolean n;
    private boolean o;
    private String p;
    private boolean q;
    private boolean r;
    private boolean s;
    private final List t;
    private final ArrayList u;
    private final boolean v;
    private final ebu w;
    private int x;
    private boolean y;
    private boolean z;

    bpd(boy boy1, boolean flag, List list, List list1, boolean flag1, ceu ceu, int i1, 
            int j1, boolean flag2, long l1, String s1, jtd jtd1, String s2)
    {
        b = bof.a();
        a = bnd.a();
        f = -1;
        g = new Handler();
        t = new ArrayList();
        u = new ArrayList();
        B = new LinkedHashMap();
        F = 0;
        L = new Random();
        N = 0;
        V = new bpe(this);
        W = new bpf(this);
        X = new bpg(this);
        Y = new bph(this);
        Z = new bpj(this);
        h = boy1.r();
        i = boy1;
        l = i1;
        m = j1;
        d = flag;
        n = flag2;
        v = flag1;
        I = s1;
        boolean flag3;
        if (jtd1 == null)
        {
            M = new jtd();
        } else
        {
            M = jtd1;
        }
        k = s2;
        Q = ceu;
        R = new brz(this, ceu);
        S = "";
        if (list != null && list.size() > 0 || list1 != null && list1.size() > 0)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (flag3)
        {
            gbh.b(flag1);
            list1 = new bqx(this, true, list, list1);
            u.add(list1);
            R.a(list);
        }
        K = false;
        if (boy1.l() == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e(flag);
        new gkh();
        j = gkh.a();
        T = false;
        boy1 = "type_null";
        j1;
        JVM INSTR tableswitch 0 3: default 392
    //                   0 552
    //                   1 531
    //                   2 524
    //                   3 517;
           goto _L1 _L2 _L3 _L4 _L5
_L2:
        break MISSING_BLOCK_LABEL_552;
_L1:
        ebw.g("Babel", (new StringBuilder(77)).append("HangoutState initialized with a CallType outside the known range: ").append(j1).toString());
_L6:
        list1 = (new StringBuilder(18)).append("source_").append(i1).toString();
        l();
        ceu = g.nS;
        if (flag3)
        {
            list = P;
        } else
        {
            list = O;
        }
        w = ebu.a(ceu, list, new String[] {
            list1, boy1
        });
        w.a(1, l1);
        return;
_L5:
        boy1 = "type_video";
          goto _L6
_L4:
        boy1 = "type_audio";
          goto _L6
_L3:
        if (n)
        {
            boy1 = "type_pstn";
        } else
        {
            boy1 = "type_tycho";
        }
          goto _L6
        boy1 = "type_unk";
          goto _L6
    }

    static long F()
    {
        return g.a(g.nS, "babel_hangout_outgoing_invite_max_duration_ms", 30000L);
    }

    public static final long G()
    {
        return g.a(g.nS, "babel_hangout_enter_step_timeout", 12000L);
    }

    public static int O()
    {
        return g.a(g.nS, "dtmf_code_duration_ms", 350);
    }

    private void a(int i1, String s1)
    {
        if (F == 0)
        {
            F = i1;
            G = s1;
        }
    }

    private void a(bpl bpl1)
    {
        for (Iterator iterator = q().iterator(); iterator.hasNext(); ((boh)iterator.next()).a(bpl1)) { }
    }

    static boolean a(bpd bpd1)
    {
        return bpd1.K;
    }

    private ArrayList ac()
    {
        return (ArrayList)u.clone();
    }

    private bqx ad()
    {
        if (u.size() == 0 || !((bqx)u.get(0)).a())
        {
            return null;
        } else
        {
            return (bqx)u.get(0);
        }
    }

    private void ae()
    {
        if (i.q() || i.c() || i.h() != null || i.i() != null || i.k() != null)
        {
            U.g(i.g()).f(i.f()).h(i.h()).i(i.i()).d(i.b()).e(i.d()).a(i.k());
        } else
        {
            U.c(i.g());
        }
        if (n)
        {
            U.a((new box(g.nS, this)).a());
        }
        a.b(U);
        D = true;
    }

    private void af()
    {
        if (!z)
        {
            z = true;
            w.a(new int[] {
                8
            });
        }
    }

    private void ag()
    {
        g.removeCallbacks(Z);
        if (B.size() > 0)
        {
            a(L());
        }
    }

    private void ah()
    {
        Object obj = r();
        if (obj != null && ((gcg) (obj)).m().size() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        obj = ((gcg) (obj)).m().iterator();
        int j1 = 0;
        int k1 = 0;
        while (((Iterator) (obj)).hasNext()) 
        {
            gho gho1 = (gho)((Iterator) (obj)).next();
            int i1;
            if (gho1 instanceof ghv)
            {
                i1 = k1 | 1;
            } else
            {
                i1 = k1;
                if (gho1 instanceof ghs)
                {
                    i1 = k1 | 2;
                }
            }
            if (gho1.k())
            {
                j1++;
            }
            k1 = i1;
        }
        if (j1 > 1)
        {
            z();
        }
        if (N != k1)
        {
            N = k1;
            Iterator iterator = q().iterator();
            while (iterator.hasNext()) 
            {
                ((boh)iterator.next()).b(k1);
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void ai()
    {
        for (Iterator iterator = q().iterator(); iterator.hasNext(); ((boh)iterator.next()).k()) { }
    }

    static void b(bpd bpd1)
    {
        bpd1.ag();
    }

    private void e(boolean flag)
    {
        if (K != flag)
        {
            K = flag;
            Y.run();
        }
    }

    private void k(String s1)
    {
        RealTimeChatService.b(this);
        i.a(s1);
        ae();
    }

    private bmw l(String s1)
    {
        for (Iterator iterator = t.iterator(); iterator.hasNext();)
        {
            bmw bmw1 = (bmw)iterator.next();
            if (s1.equals(bmw1.g()))
            {
                return bmw1;
            }
        }

        return null;
    }

    void A()
    {
        gbh.b(T);
        Object obj1 = dbf.a(i.a(), null);
        Object obj2 = dbf.f(((ani) (obj1)));
        if (TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            dbf.c(((ani) (obj1)));
            c(1019);
            return;
        }
        if (g.a(g.nS, "babel_hangout_write_logs_2", true) && g.d(l()))
        {
            String s1 = g.k(((ani) (obj1)).a());
            Object obj3 = new File(g.k(((ani) (obj1)).a()));
            if (!((File) (obj3)).exists())
            {
                ((File) (obj3)).mkdirs();
            }
            obj3 = new File(g.e());
            if (!((File) (obj3)).exists())
            {
                ((File) (obj3)).mkdirs();
            }
            g.a(i.a(), 5, 7);
            obj3 = j;
            H = (new StringBuilder(String.valueOf(s1).length() + 9 + String.valueOf(obj3).length())).append(s1).append("/").append(((String) (obj3))).append(".log.bz2").toString();
        }
        Object obj;
        int i1;
        int j1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (n)
        {
            if (dbq.F(((ani) (obj1)).h()) || dbq.G(((ani) (obj1)).h()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        if (dbq.H(((ani) (obj1)).h()) || dbq.I(((ani) (obj1)).h()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ebw.a("Babel", (new StringBuilder(21)).append("OneRpc enabled: ").append(flag).toString());
        if (flag)
        {
            obj = "On";
        } else
        {
            obj = "Off";
        }
        obj = String.valueOf(obj);
        if (((String) (obj)).length() != 0)
        {
            obj = "oneRpc".concat(((String) (obj)));
        } else
        {
            obj = new String("oneRpc");
        }
        j(((String) (obj)));
        if (m == 3)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        obj = (new gjl()).a(j).j(((ani) (obj1)).a()).k(Long.toString(dcx.a())).l(((String) (obj2)));
        j1 = l().h();
        obj1 = new inq();
        obj2 = (cfb)hgx.b(g.nS, cfb);
        if (obj2 != null && ((cfb) (obj2)).a())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        obj1.a = Boolean.valueOf(flag2);
        if (!n)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        obj1.b = Boolean.valueOf(flag2);
        obj1.c = Boolean.valueOf(dbq.i(j1));
        if (g.a(g.nS, "babel_hangout_allow_singlecast", true) && dbq.m(j1))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        obj1.d = Boolean.valueOf(flag2);
        if (dbq.n(j1))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        obj1.e = Integer.valueOf(i1);
        obj1.s = Boolean.valueOf(dbq.o(j1));
        obj1.f = Boolean.valueOf(dbq.p(j1));
        obj1.g = Boolean.valueOf(dbq.l(j1));
        if (dbq.u(j1))
        {
            i1 = 2;
        } else
        {
            i1 = 0;
        }
        obj1.h = Integer.valueOf(i1);
        obj1.i = Boolean.valueOf(dbq.x(j1));
        obj1.l = Boolean.valueOf(dbq.D(j1));
        obj1.k = Boolean.valueOf(dbq.B(j1));
        obj1.m = Boolean.valueOf(dbq.E(j1));
        obj1.q = Boolean.valueOf(flag);
        obj1.t = Float.valueOf(dbq.K(j1));
        obj1.u = Integer.valueOf((int)dbq.J(j1));
        U = ((gjl) (obj)).a(((inq) (obj1))).m(H).b(k).b(m).a(l).n(I).a(flag1).b(n).c(l().j()).d(d).e(ank.l(g.nS, l())).a(jtd.toByteArray(M));
        if (!TextUtils.isEmpty(i.g()) && !i.q())
        {
            U.c(i.g());
        }
        obj1 = a;
        if (flag)
        {
            obj = U;
        } else
        {
            obj = null;
        }
        ((bnd) (obj1)).a(((gjl) (obj)));
        a.a(false);
        a.b(false);
        T = true;
        D = false;
    }

    void B()
    {
        w.a(new int[] {
            2
        });
        g.postDelayed(V, g.a(g.nS, "babel_hangout_enter_master_timeout", 60000L));
        String s1 = i.d();
        long l1 = G();
        if (i.p())
        {
            g.postDelayed(X, l1);
            RealTimeChatService.a(this);
            C = RealTimeChatService.a(l(), i.m(), i.l());
        } else
        if ("conversation" == i.b() && aoe.a(s1))
        {
            RealTimeChatService.a(this);
            s1 = RealTimeChatService.a(i.d());
            if (s1 != null)
            {
                k(s1);
            } else
            {
                g.postDelayed(W, l1);
            }
        } else
        {
            if ("conversation" == i.b())
            {
                RealTimeChatService.m(l(), s1);
            }
            ae();
        }
        a.z();
    }

    boolean C()
    {
        gcg gcg1 = r();
        gjr gjr1 = a.d();
        return gcg1 != null && gcg1.f() && gjr1 != null && gjr1.o();
    }

    void D()
    {
        ad().f();
    }

    public boolean E()
    {
        return u.size() != 0;
    }

    public List H()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = u.iterator(); iterator.hasNext(); arraylist.addAll(((bqx)iterator.next()).e())) { }
        return arraylist;
    }

    public boolean I()
    {
        return v;
    }

    public int J()
    {
        return x;
    }

    void K()
    {
        for (Iterator iterator = ac().iterator(); iterator.hasNext(); ((bqx)iterator.next()).i()) { }
        af();
    }

    public bpl L()
    {
        if (B.size() == 0)
        {
            return null;
        } else
        {
            return (bpl)B.values().iterator().next();
        }
    }

    public int M()
    {
        return N;
    }

    public boolean N()
    {
        return K;
    }

    public String P()
    {
        return S;
    }

    public boolean Q()
    {
        return E;
    }

    public int R()
    {
        gbh.b(Integer.valueOf(F), Integer.valueOf(0));
        return F;
    }

    String S()
    {
        gbh.b(Integer.valueOf(F), Integer.valueOf(0));
        return G;
    }

    public boolean T()
    {
        return J;
    }

    public String U()
    {
        return H;
    }

    public ceu V()
    {
        return Q;
    }

    public List W()
    {
        return R.e();
    }

    Handler X()
    {
        return g;
    }

    public void a()
    {
        Object obj1 = r();
        Object obj = null;
        String s1 = obj;
        if (obj1 != null)
        {
            obj1 = ((gcg) (obj1)).n();
            s1 = obj;
            if (obj1 != null)
            {
                s1 = ((ghs) (obj1)).x();
            }
        }
        c(s1);
        for (Iterator iterator = q().iterator(); iterator.hasNext(); iterator.next()) { }
    }

    public void a(char c1)
    {
        if (r() != null)
        {
            Object obj = r().m().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                gho gho1 = (gho)((Iterator) (obj)).next();
                if (gho1 instanceof ghv)
                {
                    if (c)
                    {
                        String s1 = String.valueOf(gho1);
                        ebw.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 35)).append("HangoutState - sending dtmf: ").append(c1).append(" to: ").append(s1).toString());
                    }
                    gfd.a().a(c1, O(), gho1.a());
                }
            } while (true);
            obj = String.valueOf(S);
            S = (new StringBuilder(String.valueOf(obj).length() + 1)).append(((String) (obj))).append(c1).toString();
        }
    }

    public void a(int i1)
    {
        if (i1 == 1)
        {
            w.a(new int[] {
                7
            });
        }
    }

    public void a(int i1, ani ani1, dko dko, dbo dbo)
    {
        if (i1 == C)
        {
            ebw.g("Babel", "Create hangout id request failed");
            C = 0;
            d(((String) (null)));
        }
    }

    public void a(Bundle bundle)
    {
        String s1;
        bundle.putString("allow_on_air", String.valueOf(d));
        if (n())
        {
            s1 = "STARTED";
        } else
        {
            s1 = "STOPPED";
        }
        bundle.putString("broadcast_session_state", s1);
        f;
        JVM INSTR tableswitch 0 5: default 76
    //                   0 260
    //                   1 274
    //                   2 76
    //                   3 267
    //                   4 76
    //                   5 281;
           goto _L1 _L2 _L3 _L1 _L4 _L1 _L5
_L1:
        s1 = "";
_L7:
        bundle.putString("broadcast_use_case", s1);
        bundle.putString("connected_remote_endpoint_count", String.valueOf(J()));
        bundle.putString("is_abuse_recordable", String.valueOf(j()));
        bundle.putString("is_audio_only_mode", String.valueOf(N()));
        bundle.putString("is_awaiting", String.valueOf(E()));
        bundle.putString("is_broadcast", String.valueOf(o));
        bundle.putString("is_exiting", String.valueOf(Q()));
        bundle.putString("is_initial_outgoing_invite_pending", String.valueOf(w()));
        bundle.putString("is_recordable", String.valueOf(q));
        bundle.putString("is_recording", String.valueOf(p()));
        bundle.putString("local_session_id", m());
        bundle.putString("participant_composition", String.valueOf(M()));
        bundle.putString("should_upload_log", String.valueOf(T()));
        return;
_L2:
        s1 = "HANGOUTS_ON_AIR";
        continue; /* Loop/switch isn't completed */
_L4:
        s1 = "ENTERPRISE_RECORDING";
        continue; /* Loop/switch isn't completed */
_L3:
        s1 = "CONSUMER_RECORDING";
        continue; /* Loop/switch isn't completed */
_L5:
        s1 = "HANGOUT_ABUSE_RECORDING";
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void a(bnb bnb)
    {
        if (bnb instanceof bmw)
        {
            for (bnb = q().iterator(); bnb.hasNext(); ((boh)bnb.next()).j()) { }
        }
    }

    void a(gcg gcg1)
    {
        g.removeCallbacks(V);
        if (gcg1 != null)
        {
            a(gcg1.q(), gcg1.r());
        } else
        {
            a(30, ((String) (null)));
        }
        for (gcg1 = u.iterator(); gcg1.hasNext(); ((bqx)gcg1.next()).h()) { }
        R.d();
    }

    void a(gho gho1)
    {
        boolean flag;
        if (gho1.l() || gho1.f())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gbh.b(flag);
        x = x + 1;
        if (!y)
        {
            y = true;
            w.a(new int[] {
                9
            });
        }
        for (Iterator iterator = ac().iterator(); iterator.hasNext(); ((bqx)iterator.next()).b(gho1)) { }
        R.a(gho1);
        ah();
    }

    void a(gho gho1, Integer integer)
    {
        int i1;
        boolean flag;
        int j1;
        gbh.b(gho1.l());
        Iterator iterator;
        boolean flag1;
        boolean flag3;
        if (gho1.g())
        {
            i1 = 0;
        } else
        {
            boolean flag2;
            if (x > 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            gbh.a(flag2);
            x = x - 1;
            i1 = 1;
        }
        iterator = u.iterator();
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        if (!((bqx)iterator.next()).a(gho1))
        {
            break MISSING_BLOCK_LABEL_25;
        }
        flag = true;
_L15:
        if (u.size() != 0) goto _L4; else goto _L3
_L3:
        j1 = i1;
        if (x == 0)
        {
            j1 = i1;
            if (!o)
            {
                if ((gho1 instanceof ghv) && g.a(integer, 0) == 7)
                {
                    i1 = 1014;
                } else
                {
                    i1 = 1005;
                }
                c(i1);
                j1 = 0;
            }
        }
_L12:
        if (j1 != 0 && n)
        {
            ebr.a(g.ie);
        }
        R.b(gho1);
        ah();
        if (integer == null || !flag || !(gho1 instanceof ghv)) goto _L6; else goto _L5
_L5:
        gho1 = (ghv)gho1;
        i1 = g.a(integer, 0);
        integer = q().iterator();
        flag1 = false;
        do
        {
            if (!integer.hasNext())
            {
                break;
            }
            flag3 = ((boh)integer.next()).c(i1);
            flag1 = flag3;
            if (!flag3)
            {
                continue;
            }
            flag1 = flag3;
            break;
        } while (true);
        if (flag1) goto _L6; else goto _L7
_L7:
        integer = g.nS;
        i1;
        JVM INSTR tableswitch 7 10: default 268
    //                   7 358
    //                   8 370
    //                   9 268
    //                   10 382;
           goto _L6 _L8 _L9 _L6 _L10
_L6:
        return;
_L2:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L4:
        Iterator iterator1 = ac().iterator();
_L13:
        j1 = i1;
        if (!iterator1.hasNext()) goto _L12; else goto _L11
_L11:
        ((bqx)iterator1.next()).a(gho1, integer);
          goto _L13
          goto _L12
_L8:
        Toast.makeText(integer, l.dn, 1).show();
        return;
_L9:
        Toast.makeText(integer, l.dl, 1).show();
        return;
_L10:
        Toast.makeText(integer, integer.getString(l.dm, new Object[] {
            gho1.c()
        }), 1).show();
        return;
        if (true) goto _L15; else goto _L14
_L14:
    }

    void a(ghs ghs1)
    {
        w.a(new int[] {
            4
        });
        String s1 = String.valueOf(g.x(ghs1.a()));
        String s2 = j;
        ebw.e("Babel", (new StringBuilder(String.valueOf(s1).length() + 23 + String.valueOf(s2).length())).append("muc connected:").append(s1).append(" session:").append(s2).toString());
        for (Iterator iterator = q().iterator(); iterator.hasNext(); ((boh)iterator.next()).a(ghs1)) { }
    }

    public void a(izx izx1)
    {
        int i1;
        boolean flag;
        flag = true;
        i1 = g.a(izx1.m, -1);
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        if (izx1.k != null && izx1.k.a != null) goto _L4; else goto _L3
_L3:
        ebw.f("Babel", "No live stream status, ignore the update.");
_L5:
        return;
_L4:
        boolean flag1;
        boolean flag2;
        if (g.a(izx1.k.a, 0) != 4)
        {
            flag = false;
        }
_L6:
        flag1 = a(e, f);
        flag2 = a(flag, i1);
        e = flag;
        f = i1;
        if (flag1 != flag2)
        {
            if (p())
            {
                izx1 = g.nS;
                int j1;
                if (flag2)
                {
                    j1 = l.eJ;
                } else
                {
                    j1 = l.es;
                }
                izx1 = izx1.getString(j1);
            } else
            {
                izx1 = g.nS;
                int k1;
                if (flag2)
                {
                    k1 = l.eD;
                } else
                {
                    k1 = l.eE;
                }
                izx1 = izx1.getString(k1);
            }
            Toast.makeText(g.nS, izx1, 0).show();
        }
        izx1 = q().iterator();
        while (izx1.hasNext()) 
        {
            ((boh)izx1.next()).a();
        }
        if (true) goto _L5; else goto _L2
_L2:
        if (izx1.l == null || izx1.l.a == null)
        {
            ebw.f("Babel", "No recording status, ignore the update.");
            return;
        }
        if (g.a(izx1.l.a, 0) != 2)
        {
            flag = false;
        }
          goto _L6
    }

    public void a(String s1)
    {
        i = i.d(s1);
        if (c)
        {
            s1 = String.valueOf(i);
            ebw.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 11)).append("Updated to ").append(s1).toString());
        }
    }

    public void a(String s1, char c1)
    {
        if (c)
        {
            ebw.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 35)).append("HangoutState - sending dtmf: ").append(c1).append(" to: ").append(s1).toString());
        }
        gfd.a().a(c1, O(), s1);
        s1 = String.valueOf(S);
        S = (new StringBuilder(String.valueOf(s1).length() + 1)).append(s1).append(c1).toString();
    }

    public void a(String s1, int i1, String s2)
    {
        boolean flag;
        if (i1 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            if (i1 == 2)
            {
                c(1004);
                return;
            }
            s2 = new bpl(s1, i1, s2);
            B.put(s1, s2);
            if (B.size() == 1)
            {
                ag();
                return;
            }
        }
    }

    public void a(String s1, String s2)
    {
        g.removeCallbacks(W);
        if (!E)
        {
            gbh.b(E);
            String s3 = i.d();
            if (!"conversation".equals(i.b()) || !aoe.a(s3))
            {
                gbh.a(i.p());
            } else
            if (s3.equals(s1))
            {
                k(s2);
                a.z();
                return;
            }
        }
    }

    void a(List list, List list1)
    {
        list1 = new bqx(this, false, list, list1);
        u.add(list1);
        list1.f();
        R.a(list);
    }

    public void a(jev jev1)
    {
        jev1.a = dbf.f(l());
        jev1.k = m();
        if (i != null)
        {
            jev1.c = i.g();
            jev1.f = new jfm();
            jev1.f.a = i.e();
        }
        String s2 = k;
        gcg gcg1 = r();
        String s1 = s2;
        if (gcg1 != null)
        {
            jev1.b = gcg1.h();
            s1 = s2;
            if (TextUtils.isEmpty(s2))
            {
                s1 = gcg1.i();
            }
        }
        if (!TextUtils.isEmpty(s1))
        {
            jev1.e = s1;
        }
    }

    public void a(boolean flag)
    {
        s = flag;
    }

    public boolean a(HangoutActivity hangoutactivity)
    {
        boy boy1 = hangoutactivity.m();
        if (hangoutactivity.j())
        {
            return h.equals(boy1) || i.equals(boy1);
        } else
        {
            return i.equals(boy1);
        }
    }

    public boolean a(boolean flag, int i1)
    {
        if (i1 == -1)
        {
            if (q || d)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
        } else
        if (i1 == 0 || i1 == 1 || i1 == 3)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        return i1 != 0 && flag;
    }

    public void b(int i1)
    {
        N = i1;
    }

    public void b(bnb bnb)
    {
        if (bnb instanceof bmw)
        {
            t.remove(bnb);
        }
    }

    void b(gho gho1)
    {
        for (Iterator iterator = ac().iterator(); iterator.hasNext(); ((bqx)iterator.next()).j()) { }
        if (x == 0)
        {
            for (Iterator iterator1 = q().iterator(); iterator1.hasNext(); ((boh)iterator1.next()).a(gho1)) { }
        }
        af();
    }

    public void b(String s1)
    {
        i = i.e(s1);
        if (c)
        {
            s1 = String.valueOf(i);
            ebw.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 11)).append("Updated to ").append(s1).toString());
        }
    }

    public void b(boolean flag)
    {
        o = flag;
        boolean flag1;
        if (!o || !q)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        gbh.a(flag1);
        if (!flag)
        {
            return;
        } else
        {
            ((gaq)a.p().a(gaq)).a(new bpi(this));
            return;
        }
    }

    public void c(int i1)
    {
        if (!E)
        {
            E = true;
            T = false;
            a(i1, ((String) (null)));
            w.b();
            g.removeCallbacks(V);
            g.removeCallbacks(W);
            g.removeCallbacks(X);
            C = 0;
            RealTimeChatService.b(this);
            for (Iterator iterator = t.iterator(); iterator.hasNext(); ((bmw)iterator.next()).h()) { }
            t.clear();
            for (Iterator iterator1 = ac().iterator(); iterator1.hasNext(); ((bqx)iterator1.next()).g()) { }
            for (Iterator iterator2 = q().iterator(); iterator2.hasNext(); ((boh)iterator2.next()).e()) { }
            if (D)
            {
                a.a(i1);
            }
            if (x == 0 && i.e() != null)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                RealTimeChatService.j(l(), i.e());
            }
            if (!D)
            {
                a.e();
                return;
            }
        }
    }

    public void c(bnb bnb)
    {
        if (bnb instanceof bmw)
        {
            ai();
        }
    }

    public void c(String s1)
    {
        p = s1;
    }

    public void c(boolean flag)
    {
        q = flag;
        if (!o || !q)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gbh.a(flag);
    }

    public boy d()
    {
        return h;
    }

    public void d(String s1)
    {
        gbh.a(i.p());
        if (C == 0)
        {
            return;
        }
        g.removeCallbacks(X);
        RealTimeChatService.b(this);
        C = 0;
        if (s1 == null)
        {
            c(15);
            return;
        } else
        {
            a(s1);
            a.z();
            ae();
            return;
        }
    }

    public void d(boolean flag)
    {
        r = flag;
    }

    public boy e()
    {
        return i;
    }

    public void e(String s1)
    {
        if (L() == (bpl)B.remove(s1))
        {
            a(((bpl) (null)));
            if (B.size() > 0)
            {
                g.postDelayed(Z, 1000L);
            }
        }
    }

    public String f()
    {
        if (h.q())
        {
            return String.format("%s/%s/%s", new Object[] {
                g.a(g.nS, "babel_hangout_named_shortlink_base_url", "http://g.co/hangouts"), h.f(), h.g()
            });
        }
        String s2 = g.a(g.nS, "babel_hangout_base_url", "https://plus.google.com/hangouts");
        boolean flag = g.a(g.nS, "babel_hangout_underscore_after_base_url", true);
        String s3 = i.g();
        gbh.b(s3);
        String s1;
        if (flag)
        {
            s1 = "%s/_/%s";
        } else
        {
            s1 = "%s/%s";
        }
        return String.format(s1, new Object[] {
            s2, s3
        });
    }

    public void f(String s1)
    {
        if (H != null)
        {
            gfd.a(s1);
            J = true;
        }
    }

    int g()
    {
        return m;
    }

    public void g(String s1)
    {
        s1 = l(s1);
        if (s1 != null)
        {
            s1.e();
            return;
        } else
        {
            ai();
            return;
        }
    }

    public void h(String s1)
    {
        s1 = l(s1);
        if (s1 != null)
        {
            s1.f();
        }
    }

    public boolean h()
    {
        return s;
    }

    public void i(String s1)
    {
        s1 = new bmw(l(), e().g(), r().n().b(), s1);
        t.add(s1);
        s1.a(this);
        s1.d();
    }

    public boolean i()
    {
        return !o && !q;
    }

    public void j(String s1)
    {
        w.a(s1);
    }

    public boolean j()
    {
        return r && g.a(g.nS, "babel_enable_abuse_reporting", true);
    }

    public boolean k()
    {
        return n;
    }

    public ani l()
    {
        return dbf.a(i.a(), null);
    }

    public String m()
    {
        return j;
    }

    public boolean n()
    {
        return e;
    }

    public int o()
    {
        return f;
    }

    public boolean p()
    {
        if (f == -1)
        {
            return q;
        }
        return f != 0;
    }

    List q()
    {
        return b.b();
    }

    public gcg r()
    {
        gcg gcg1 = gfd.a().b();
        boolean flag;
        if (gcg1 == null || gcg1.g().equals(j))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gbh.a(flag);
        return gcg1;
    }

    public void s()
    {
        w.a(new int[] {
            3
        });
        J = false;
        if (H != null)
        {
            if (Math.abs(L.nextInt() % 10000) < g.a(g.nS, "babel_hangout_upload_rate_2", 10))
            {
                gfd.a("Triggering sampled debug log");
                J = true;
            }
            if (g.a(g.nS, "babel_hangout_upload_logs_2", false))
            {
                gfd.a("Triggering log upload for auto_plugin_log_upload experiment");
                J = true;
            }
        }
    }

    List t()
    {
        return u;
    }

    List u()
    {
        bqx bqx1 = ad();
        if (bqx1 == null)
        {
            return null;
        } else
        {
            return bqx1.b();
        }
    }

    List v()
    {
        bqx bqx1 = ad();
        if (bqx1 == null)
        {
            return null;
        } else
        {
            return bqx1.c();
        }
    }

    public boolean w()
    {
        bqx bqx1 = ad();
        return bqx1 != null && bqx1.d() == 0L;
    }

    void x()
    {
        g.removeCallbacks(V);
        w.a(new int[] {
            5
        });
    }

    public void y()
    {
        if (!A)
        {
            w.a(new int[] {
                6
            });
            A = true;
        }
        z();
    }

    public void z()
    {
        if (K)
        {
            if (!bnd.j())
            {
                gir gir1 = a.k();
                if (gir1.b().equals(giw.b) && gir1.c().contains(giv.a))
                {
                    gir1.a(giv.a);
                }
            }
            e(false);
        }
    }

    static 
    {
        hik hik = ebw.f;
    }
}
