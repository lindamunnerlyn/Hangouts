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
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;

public final class bpm extends dhy
{

    private static final int M[] = {
        1, 2
    };
    private static final int N[] = {
        1, 3
    };
    private static final boolean c = false;
    private int A;
    private boolean B;
    private boolean C;
    private int D;
    private String E;
    private String F;
    private String G;
    private boolean H;
    private boolean I;
    private final Random J;
    private kbg K;
    private int L;
    private final cfz O;
    private final bsi P;
    private String Q;
    private boolean R;
    private gmn S;
    private final Runnable T;
    private final Runnable U;
    private final Runnable V;
    private final Runnable W;
    private final Runnable X;
    public final bnk a;
    private final boo b;
    private final boolean d;
    private boolean e;
    private int f;
    private final Handler g;
    private final bph h;
    private bph i;
    private final String j;
    private final String k;
    private final int l;
    private final int m;
    private final boolean n;
    private boolean o;
    private String p;
    private boolean q;
    private boolean r;
    private final ArrayList s;
    private final boolean t;
    private final ees u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private final LinkedHashMap z;

    bpm(bph bph1, boolean flag, List list, List list1, boolean flag1, cfz cfz, int i1, 
            int j1, boolean flag2, long l1, String s1, kbg kbg1, String s2)
    {
        b = boo.a();
        a = bnk.a();
        f = -1;
        g = new Handler();
        s = new ArrayList();
        z = new LinkedHashMap();
        D = 0;
        J = new Random();
        L = 0;
        T = new bpn(this);
        U = new bpo(this);
        V = new bpp(this);
        W = new bpq(this);
        X = new bps(this);
        h = bph1.r();
        i = bph1;
        l = i1;
        m = j1;
        d = flag;
        n = flag2;
        t = flag1;
        G = s1;
        boolean flag3;
        if (kbg1 == null)
        {
            K = new kbg();
        } else
        {
            K = kbg1;
        }
        k = s2;
        O = cfz;
        P = new bsi(this, cfz);
        Q = "";
        if (list != null && list.size() > 0 || list1 != null && list1.size() > 0)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (flag3)
        {
            gdv.b("Expected condition to be false", flag1);
            list1 = new brg(this, true, list, list1);
            s.add(list1);
            P.a(list);
        }
        I = false;
        if (bph1.l() == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d(flag);
        new gnj();
        j = gnj.a();
        R = false;
        bph1 = "type_null";
        j1;
        JVM INSTR tableswitch 0 3: default 384
    //                   0 569
    //                   1 548
    //                   2 541
    //                   3 534;
           goto _L1 _L2 _L3 _L4 _L5
_L2:
        break MISSING_BLOCK_LABEL_569;
_L1:
        eev.g("Babel", (new StringBuilder(77)).append("HangoutState initialized with a CallType outside the known range: ").append(j1).toString());
_L6:
        list1 = (new StringBuilder(18)).append("source_").append(i1).toString();
        cfz = g.nU;
        if (flag3)
        {
            list = N;
        } else
        {
            list = M;
        }
        eev.c("CallMarkReporter", "Creating startup reporter");
        s1 = new ArrayList();
        Collections.addAll(s1, new String[] {
            list1, bph1
        });
        u = new ees(cfz, list, s1);
        u.a(1, l1);
        return;
_L5:
        bph1 = "type_video";
          goto _L6
_L4:
        bph1 = "type_audio";
          goto _L6
_L3:
        if (n)
        {
            bph1 = "type_pstn";
        } else
        {
            bph1 = "type_tycho";
        }
          goto _L6
        bph1 = "type_unk";
          goto _L6
    }

    static long E()
    {
        return g.a(g.nU, "babel_hangout_outgoing_invite_max_duration_ms", 30000L);
    }

    public static final long F()
    {
        return g.a(g.nU, "babel_hangout_enter_step_timeout", 12000L);
    }

    public static int N()
    {
        return g.a(g.nU, "dtmf_code_duration_ms", 350);
    }

    private void a(int i1, String s1)
    {
        if (D == 0)
        {
            D = i1;
            E = s1;
        }
    }

    private void a(bpu bpu1)
    {
        for (Iterator iterator = p().iterator(); iterator.hasNext(); ((boq)iterator.next()).a(bpu1)) { }
    }

    static boolean a(bpm bpm1)
    {
        return bpm1.I;
    }

    private ArrayList ab()
    {
        return (ArrayList)s.clone();
    }

    private brg ac()
    {
        if (s.size() == 0 || !((brg)s.get(0)).a())
        {
            return null;
        } else
        {
            return (brg)s.get(0);
        }
    }

    private void ad()
    {
        if (i.q() || i.c() || i.h() != null || i.i() != null || i.k() != null)
        {
            S.g(i.g()).f(i.f()).h(i.h()).i(i.i()).d(i.b()).e(i.d()).a(i.k());
        } else
        {
            S.c(i.g());
        }
        if (n)
        {
            S.a((new bpg(g.nU, this)).a());
        }
        a.b(S);
        B = true;
    }

    private void ae()
    {
        if (!x)
        {
            x = true;
            u.a(new int[] {
                8
            });
        }
    }

    private void af()
    {
        g.removeCallbacks(X);
        if (z.size() > 0)
        {
            a(K());
        }
    }

    private void ag()
    {
        Object obj = q();
        if (obj != null && ((geu) (obj)).m().size() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        obj = ((geu) (obj)).m().iterator();
        int j1 = 0;
        int k1 = 0;
        while (((Iterator) (obj)).hasNext()) 
        {
            gkq gkq1 = (gkq)((Iterator) (obj)).next();
            int i1;
            if (gkq1 instanceof gkx)
            {
                i1 = k1 | 1;
            } else
            {
                i1 = k1;
                if (gkq1 instanceof gku)
                {
                    i1 = k1 | 2;
                }
            }
            if (gkq1.j())
            {
                j1++;
            }
            k1 = i1;
        }
        if (j1 > 1)
        {
            y();
        }
        if (L != k1)
        {
            L = k1;
            Iterator iterator = p().iterator();
            while (iterator.hasNext()) 
            {
                ((boq)iterator.next()).b(k1);
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    static void b(bpm bpm1)
    {
        bpm1.af();
    }

    private void d(boolean flag)
    {
        if (I != flag)
        {
            I = flag;
            W.run();
        }
    }

    private void h(String s1)
    {
        RealTimeChatService.b(this);
        i.a(s1);
        ad();
    }

    void A()
    {
        u.a(new int[] {
            2
        });
        g.postDelayed(T, g.a(g.nU, "babel_hangout_enter_master_timeout", 60000L));
        String s1 = i.d();
        long l1 = F();
        if (i.p())
        {
            g.postDelayed(V, l1);
            RealTimeChatService.a(this);
            A = RealTimeChatService.a(k(), i.m(), i.l());
        } else
        if ("conversation" == i.b() && aow.a(s1))
        {
            RealTimeChatService.a(this);
            s1 = RealTimeChatService.a(i.d());
            if (s1 != null)
            {
                h(s1);
            } else
            {
                g.postDelayed(U, l1);
            }
        } else
        {
            if ("conversation" == i.b())
            {
                RealTimeChatService.m(k(), s1);
            }
            ad();
        }
        a.x();
    }

    boolean B()
    {
        geu geu1 = q();
        gmt gmt1 = a.d();
        return geu1 != null && geu1.f() && gmt1 != null && gmt1.o();
    }

    void C()
    {
        ac().f();
    }

    public boolean D()
    {
        return s.size() != 0;
    }

    public List G()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = s.iterator(); iterator.hasNext(); arraylist.addAll(((brg)iterator.next()).e())) { }
        return arraylist;
    }

    public boolean H()
    {
        return t;
    }

    public int I()
    {
        return v;
    }

    void J()
    {
        for (Iterator iterator = ab().iterator(); iterator.hasNext(); ((brg)iterator.next()).i()) { }
        ae();
    }

    public bpu K()
    {
        if (z.size() == 0)
        {
            return null;
        } else
        {
            return (bpu)z.values().iterator().next();
        }
    }

    public int L()
    {
        return L;
    }

    public boolean M()
    {
        return I;
    }

    public String O()
    {
        return Q;
    }

    public boolean P()
    {
        return C;
    }

    public int Q()
    {
        gdv.b(Integer.valueOf(D), Integer.valueOf(0));
        return D;
    }

    String R()
    {
        gdv.b(Integer.valueOf(D), Integer.valueOf(0));
        return E;
    }

    public boolean S()
    {
        return H;
    }

    public String T()
    {
        return F;
    }

    public cfz U()
    {
        return O;
    }

    public List V()
    {
        return P.e();
    }

    Handler W()
    {
        return g;
    }

    public void a(char c1)
    {
        if (q() != null)
        {
            Object obj = q().m().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                gkq gkq1 = (gkq)((Iterator) (obj)).next();
                if (gkq1 instanceof gkx)
                {
                    if (c)
                    {
                        String s1 = String.valueOf(gkq1);
                        eev.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 35)).append("HangoutState - sending dtmf: ").append(c1).append(" to: ").append(s1).toString());
                    }
                    gic.a().a(c1, N(), gkq1.a());
                }
            } while (true);
            obj = String.valueOf(Q);
            Q = (new StringBuilder(String.valueOf(obj).length() + 1)).append(((String) (obj))).append(c1).toString();
        }
    }

    public void a(int i1)
    {
        if (i1 == 1)
        {
            u.a(new int[] {
                7
            });
        }
    }

    public void a(int i1, aoa aoa1, dmf dmf, dcx dcx)
    {
        if (i1 == A)
        {
            eev.g("Babel", "Create hangout id request failed");
            A = 0;
            d(((String) (null)));
        }
    }

    public void a(Bundle bundle)
    {
        String s1;
        bundle.putString("allow_on_air", String.valueOf(d));
        if (m())
        {
            s1 = "STARTED";
        } else
        {
            s1 = "STOPPED";
        }
        bundle.putString("broadcast_session_state", s1);
        f;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 238
    //                   1 252
    //                   2 68
    //                   3 245;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        s1 = "";
_L6:
        bundle.putString("broadcast_use_case", s1);
        bundle.putString("connected_remote_endpoint_count", String.valueOf(I()));
        bundle.putString("is_audio_only_mode", String.valueOf(M()));
        bundle.putString("is_awaiting", String.valueOf(D()));
        bundle.putString("is_broadcast", String.valueOf(o));
        bundle.putString("is_exiting", String.valueOf(P()));
        bundle.putString("is_initial_outgoing_invite_pending", String.valueOf(v()));
        bundle.putString("is_recordable", String.valueOf(q));
        bundle.putString("is_recording", String.valueOf(o()));
        bundle.putString("local_session_id", l());
        bundle.putString("participant_composition", String.valueOf(L()));
        bundle.putString("should_upload_log", String.valueOf(S()));
        return;
_L2:
        s1 = "HANGOUTS_ON_AIR";
        continue; /* Loop/switch isn't completed */
_L4:
        s1 = "ENTERPRISE_RECORDING";
        continue; /* Loop/switch isn't completed */
_L3:
        s1 = "CONSUMER_RECORDING";
        if (true) goto _L6; else goto _L5
_L5:
    }

    void a(geu geu1)
    {
        g.removeCallbacks(T);
        if (geu1 != null)
        {
            a(geu1.p(), geu1.q());
        } else
        {
            a(30, ((String) (null)));
        }
        for (geu1 = s.iterator(); geu1.hasNext(); ((brg)geu1.next()).h()) { }
        P.d();
    }

    void a(gkq gkq1)
    {
        boolean flag;
        if (gkq1.k() || gkq1.e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gdv.b("Expected condition to be false", flag);
        v = v + 1;
        if (!w)
        {
            w = true;
            u.a(new int[] {
                9
            });
        }
        for (Iterator iterator = ab().iterator(); iterator.hasNext(); ((brg)iterator.next()).b(gkq1)) { }
        P.a(gkq1);
        ag();
    }

    void a(gkq gkq1, Integer integer)
    {
        int i1;
        boolean flag;
        int j1;
        gdv.b("Expected condition to be false", gkq1.k());
        Iterator iterator;
        boolean flag1;
        boolean flag3;
        if (gkq1.f())
        {
            i1 = 0;
        } else
        {
            boolean flag2;
            if (v > 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            gdv.a("Expected condition to be true", flag2);
            v = v - 1;
            i1 = 1;
        }
        iterator = s.iterator();
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        if (!((brg)iterator.next()).a(gkq1))
        {
            break MISSING_BLOCK_LABEL_27;
        }
        flag = true;
_L15:
        if (s.size() != 0) goto _L4; else goto _L3
_L3:
        j1 = i1;
        if (v == 0)
        {
            j1 = i1;
            if (!o)
            {
                if ((gkq1 instanceof gkx) && g.a(integer, 0) == 7)
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
            eep.a(g.hW);
        }
        P.b(gkq1);
        ag();
        if (integer == null || !flag || !(gkq1 instanceof gkx)) goto _L6; else goto _L5
_L5:
        gkq1 = (gkx)gkq1;
        i1 = g.a(integer, 0);
        integer = p().iterator();
        flag1 = false;
        do
        {
            if (!integer.hasNext())
            {
                break;
            }
            flag3 = ((boq)integer.next()).c(i1);
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
        integer = g.nU;
        i1;
        JVM INSTR tableswitch 7 10: default 268
    //                   7 361
    //                   8 373
    //                   9 268
    //                   10 385;
           goto _L6 _L8 _L9 _L6 _L10
_L6:
        return;
_L2:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L4:
        Iterator iterator1 = ab().iterator();
_L13:
        j1 = i1;
        if (!iterator1.hasNext()) goto _L12; else goto _L11
_L11:
        ((brg)iterator1.next()).a(gkq1, integer);
          goto _L13
          goto _L12
_L8:
        Toast.makeText(integer, l.cW, 0).show();
        return;
_L9:
        Toast.makeText(integer, l.cU, 0).show();
        return;
_L10:
        Toast.makeText(integer, integer.getString(l.cV, new Object[] {
            gkq1.b()
        }), 0).show();
        return;
        if (true) goto _L15; else goto _L14
_L14:
    }

    void a(gku gku1)
    {
        u.a(new int[] {
            4
        });
        for (Iterator iterator = p().iterator(); iterator.hasNext(); ((boq)iterator.next()).a(gku1)) { }
    }

    public void a(String s1)
    {
        i = i.d(s1);
        if (c)
        {
            s1 = String.valueOf(i);
            eev.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 11)).append("Updated to ").append(s1).toString());
        }
    }

    public void a(String s1, char c1)
    {
        if (c)
        {
            eev.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 35)).append("HangoutState - sending dtmf: ").append(c1).append(" to: ").append(s1).toString());
        }
        gic.a().a(c1, N(), s1);
        s1 = String.valueOf(Q);
        Q = (new StringBuilder(String.valueOf(s1).length() + 1)).append(s1).append(c1).toString();
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
            s2 = new bpu(s1, i1, s2);
            z.put(s1, s2);
            if (z.size() == 1)
            {
                af();
                return;
            }
        }
    }

    public void a(String s1, String s2)
    {
        g.removeCallbacks(U);
        if (!C)
        {
            gdv.b("Expected condition to be false", C);
            String s3 = i.d();
            if (!"conversation".equals(i.b()) || !aow.a(s3))
            {
                gdv.a("Expected condition to be true", i.p());
            } else
            if (s3.equals(s1))
            {
                h(s2);
                a.x();
                return;
            }
        }
    }

    void a(List list, List list1)
    {
        list1 = new brg(this, false, list, list1);
        s.add(list1);
        list1.f();
        P.a(list);
    }

    public void a(jgc jgc1)
    {
        int i1;
        boolean flag;
        flag = true;
        i1 = g.a(jgc1.m, -1);
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        if (jgc1.k != null && jgc1.k.a != null) goto _L4; else goto _L3
_L3:
        eev.f("Babel", "No live stream status, ignore the update.");
_L5:
        return;
_L4:
        boolean flag1;
        boolean flag2;
        if (g.a(jgc1.k.a, 0) != 4)
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
            if (o())
            {
                jgc1 = g.nU;
                int j1;
                if (flag2)
                {
                    j1 = l.es;
                } else
                {
                    j1 = l.eb;
                }
                jgc1 = jgc1.getString(j1);
            } else
            {
                jgc1 = g.nU;
                int k1;
                if (flag2)
                {
                    k1 = l.em;
                } else
                {
                    k1 = l.en;
                }
                jgc1 = jgc1.getString(k1);
            }
            Toast.makeText(g.nU, jgc1, 0).show();
        }
        jgc1 = p().iterator();
        while (jgc1.hasNext()) 
        {
            ((boq)jgc1.next()).a();
        }
        if (true) goto _L5; else goto _L2
_L2:
        if (jgc1.l == null || jgc1.l.a == null)
        {
            eev.f("Babel", "No recording status, ignore the update.");
            return;
        }
        if (g.a(jgc1.l.a, 0) != 2)
        {
            flag = false;
        }
          goto _L6
    }

    public void a(jlk jlk1)
    {
        jlk1.a = dcn.e(k());
        jlk1.k = l();
        if (i != null)
        {
            jlk1.c = i.g();
            jlk1.f = new jmb();
            jlk1.f.a = i.e();
        }
        String s2 = k;
        geu geu1 = q();
        String s1 = s2;
        if (geu1 != null)
        {
            jlk1.b = geu1.h();
            s1 = s2;
            if (TextUtils.isEmpty(s2))
            {
                s1 = geu1.i();
            }
        }
        if (!TextUtils.isEmpty(s1))
        {
            jlk1.e = s1;
        }
    }

    public void a(boolean flag)
    {
        r = flag;
    }

    public boolean a(HangoutActivity hangoutactivity)
    {
        bph bph1 = hangoutactivity.m();
        if (hangoutactivity.j())
        {
            return h.equals(bph1) || i.equals(bph1);
        } else
        {
            return i.equals(bph1);
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
        L = i1;
    }

    void b(gkq gkq1)
    {
        for (Iterator iterator = ab().iterator(); iterator.hasNext(); ((brg)iterator.next()).j()) { }
        if (v == 0)
        {
            for (Iterator iterator1 = p().iterator(); iterator1.hasNext(); ((boq)iterator1.next()).a(gkq1)) { }
        }
        ae();
    }

    public void b(String s1)
    {
        i = i.e(s1);
        if (c)
        {
            s1 = String.valueOf(i);
            eev.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 11)).append("Updated to ").append(s1).toString());
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
        gdv.a("Expected condition to be true", flag1);
        if (!flag)
        {
            return;
        } else
        {
            ((gde)a.o().a(gde)).a(new bpr(this));
            return;
        }
    }

    public void c(int i1)
    {
        if (!C)
        {
            C = true;
            R = false;
            a(i1, ((String) (null)));
            u.a();
            g.removeCallbacks(T);
            g.removeCallbacks(U);
            g.removeCallbacks(V);
            A = 0;
            RealTimeChatService.b(this);
            for (Iterator iterator = ab().iterator(); iterator.hasNext(); ((brg)iterator.next()).g()) { }
            for (Iterator iterator1 = p().iterator(); iterator1.hasNext(); ((boq)iterator1.next()).e()) { }
            if (B)
            {
                a.a(i1);
            }
            if (v == 0 && i.e() != null)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                RealTimeChatService.j(k(), i.e());
            }
            if (!B)
            {
                a.e();
                return;
            }
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
        gdv.a("Expected condition to be true", flag);
    }

    public bph d()
    {
        return h;
    }

    public void d(String s1)
    {
        gdv.a("Expected condition to be true", i.p());
        if (A == 0)
        {
            return;
        }
        g.removeCallbacks(V);
        RealTimeChatService.b(this);
        A = 0;
        if (s1 == null)
        {
            c(15);
            return;
        } else
        {
            a(s1);
            a.x();
            ad();
            return;
        }
    }

    public bph e()
    {
        return i;
    }

    public void e(String s1)
    {
        if (K() == (bpu)z.remove(s1))
        {
            a(((bpu) (null)));
            if (z.size() > 0)
            {
                g.postDelayed(X, 1000L);
            }
        }
    }

    public String f()
    {
        if (h.q())
        {
            return String.format("%s/%s/%s", new Object[] {
                g.a(g.nU, "babel_hangout_named_shortlink_base_url", "http://g.co/hangouts"), h.f(), h.g()
            });
        }
        String s2 = g.a(g.nU, "babel_hangout_base_url", "https://plus.google.com/hangouts");
        boolean flag = g.a(g.nU, "babel_hangout_underscore_after_base_url", true);
        String s3 = i.g();
        gdv.b("Expected non-null", s3);
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
        if (F != null)
        {
            gic.b(s1);
            H = true;
        }
    }

    int g()
    {
        return m;
    }

    public void g(String s1)
    {
        u.a(s1);
    }

    public boolean h()
    {
        return r;
    }

    public boolean i()
    {
        return !o && !q;
    }

    public boolean j()
    {
        return n;
    }

    public aoa k()
    {
        return dcn.a(i.a(), null);
    }

    public String l()
    {
        return j;
    }

    public boolean m()
    {
        return e;
    }

    public int n()
    {
        return f;
    }

    public boolean o()
    {
        if (f == -1)
        {
            return q;
        }
        return f != 0;
    }

    List p()
    {
        return b.b();
    }

    public geu q()
    {
        geu geu1 = gic.a().b();
        boolean flag;
        if (geu1 == null || geu1.g().equals(j))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gdv.a("Expected condition to be true", flag);
        return geu1;
    }

    public void r()
    {
        u.a(new int[] {
            3
        });
        H = false;
        if (F != null)
        {
            if (Math.abs(J.nextInt() % 10000) < g.a(g.nU, "babel_hangout_upload_rate_2", 10))
            {
                gic.b("Triggering sampled debug log");
                H = true;
            }
            if (g.a(g.nU, "babel_hangout_upload_logs_2", false))
            {
                gic.b("Triggering log upload for auto_plugin_log_upload experiment");
                H = true;
            }
        }
    }

    List s()
    {
        return s;
    }

    List t()
    {
        brg brg1 = ac();
        if (brg1 == null)
        {
            return null;
        } else
        {
            return brg1.b();
        }
    }

    List u()
    {
        brg brg1 = ac();
        if (brg1 == null)
        {
            return null;
        } else
        {
            return brg1.c();
        }
    }

    public boolean v()
    {
        brg brg1 = ac();
        return brg1 != null && brg1.d() == 0L;
    }

    void w()
    {
        g.removeCallbacks(T);
        u.a(new int[] {
            5
        });
    }

    public void x()
    {
        if (!y)
        {
            u.a(new int[] {
                6
            });
            y = true;
        }
        y();
    }

    public void y()
    {
        if (I)
        {
            if (!bnk.i())
            {
                glt glt1 = a.j();
                if (glt1.b().equals(gly.b) && glt1.c().contains(glx.a))
                {
                    glt1.a(glx.a);
                }
            }
            d(false);
        }
    }

    void z()
    {
        gdv.b("Expected condition to be false", R);
        aoa aoa1 = dcn.a(i.a(), null);
        Object obj1 = dcn.e(aoa1);
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            dcn.c(aoa1);
            c(1019);
            return;
        }
        Object obj = "";
        String s1 = ((String) (obj));
        if (g.a(g.nU, "babel_hangout_write_logs_2", true))
        {
            s1 = ((String) (obj));
            if (g.c(k()))
            {
                s1 = g.k(aoa1.a());
                obj = new File(g.k(aoa1.a()));
                if (!((File) (obj)).exists())
                {
                    ((File) (obj)).mkdirs();
                }
                obj = new File(g.d());
                if (!((File) (obj)).exists())
                {
                    ((File) (obj)).mkdirs();
                }
                g.a(i.a(), 6, 7);
                obj = j;
                s1 = (new StringBuilder(String.valueOf(s1).length() + 5 + String.valueOf(obj).length())).append(s1).append("/").append(((String) (obj))).append(".log").toString();
                F = String.valueOf(s1).concat(".bz2");
            }
        }
        Object obj2;
        byte byte0;
        int i1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (n)
        {
            if (dcz.H(aoa1.h()) || dcz.I(aoa1.h()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        if (dcz.J(aoa1.h()) || dcz.K(aoa1.h()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        eev.a("Babel", (new StringBuilder(21)).append("OneRpc enabled: ").append(flag).toString());
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
        g(((String) (obj)));
        if (m == 3)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        obj = new gmn();
        obj2 = new lch();
        obj2.b = Integer.valueOf(407);
        obj = ((gmn) (obj)).a(((lch) (obj2))).a(j).j(aoa1.a()).k(Long.toString(def.a())).l(((String) (obj1)));
        i1 = k().h();
        obj1 = new itv();
        obj2 = (cgg)hlp.b(g.nU, cgg);
        if (obj2 != null && ((cgg) (obj2)).a())
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
        obj1.c = Boolean.valueOf(dcz.i(i1));
        obj1.r = Integer.valueOf((int)dcz.j(i1));
        obj1.w = Integer.valueOf((int)dcz.k(i1));
        obj1.x = Integer.valueOf((int)dcz.l(i1));
        if (g.a(g.nU, "babel_hangout_allow_singlecast", true) && dcz.p(i1))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        obj1.d = Boolean.valueOf(flag2);
        obj1.s = Boolean.valueOf(dcz.q(i1));
        obj1.f = Boolean.valueOf(dcz.r(i1));
        obj1.g = Boolean.valueOf(dcz.o(i1));
        if (dcz.w(i1))
        {
            byte0 = 3;
        } else
        {
            byte0 = 2;
        }
        obj1.h = Integer.valueOf(byte0);
        obj1.i = Boolean.valueOf(dcz.z(i1));
        obj1.l = Boolean.valueOf(dcz.F(i1));
        obj1.k = Boolean.valueOf(dcz.D(i1));
        obj1.m = Boolean.valueOf(dcz.G(i1));
        obj1.q = Boolean.valueOf(flag);
        obj1.t = Float.valueOf(dcz.P(i1));
        obj1.u = Integer.valueOf((int)dcz.N(i1));
        if (dcz.L(i1) || dcz.M(i1))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        obj1.v = Boolean.valueOf(flag2);
        S = ((gmn) (obj)).a(((itv) (obj1))).m(F).b(k).b(m).a(l).n(G).a(flag1).b(n).c(k().i()).d(d).a(kbg.toByteArray(K));
        if (!TextUtils.isEmpty(i.g()) && !i.q())
        {
            S.c(i.g());
        }
        obj1 = a;
        if (flag)
        {
            obj = S;
        } else
        {
            obj = null;
        }
        ((bnk) (obj1)).a(((gmn) (obj)));
        ((dra)hlp.a(g.nU, dra)).a(aoa1.h(), j, s1, System.currentTimeMillis());
        a.a(false);
        a.b(false);
        R = true;
        B = false;
    }

    static 
    {
        hnc hnc = eev.f;
    }
}
