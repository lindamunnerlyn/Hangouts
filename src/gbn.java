// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.hangouts.video.RendererManager;
import org.webrtc.voiceengine.WebRtcAudioTrack;

public final class gbn
    implements gjk
{

    final Context a;
    final gbs b;
    final gdd c = new gdd();
    final gen d;
    final gjz e;
    gjl f;
    boolean g;
    int h;
    String i;
    boolean j;
    gjq k;
    private final gdg l = new gdg();
    private final gbr m = new gbr(this);
    private final RendererManager n;
    private final gdx o;
    private final gez p;
    private gjv q;
    private gji r;
    private gjj s;
    private boolean t;

    gbn(Context context, gjl gjl1)
    {
        g = false;
        h = 0;
        i = null;
        j = true;
        k = null;
        a = context;
        f = gjl1;
        b = new gbs(context);
        d = new gen(b, c);
        n = new RendererManager(context);
        o = new gdx(context, b, l, n, d);
        p = new gez(b, l, n, d);
        e = new gjz(context, this);
        WebRtcAudioTrack.setAudioMute(false);
        b.a(m);
        gfd.a().a(b);
        if (f != null)
        {
            a(context, f);
            b.b(f);
        }
    }

    private static void a(Context context, gjl gjl1)
    {
        gbh.b("accountName not specified in CallInfo!", TextUtils.isEmpty(gjl1.n()));
        new gkh();
        if (TextUtils.isEmpty(gjl1.a()))
        {
            gjl1.a(gkh.a());
        }
        if (TextUtils.isEmpty(gjl1.b()))
        {
            gjl1.b(gkh.a());
        }
        if (gjl1.o() == null)
        {
            gjl1.k(context.getPackageName());
        }
        if (gjl1.p() == null)
        {
            gjl1.l(gkh.a());
        }
    }

    private static void a(String s1, String s2, boolean flag, String s3)
    {
        if (s1 == null)
        {
            if (!flag)
            {
                s1 = String.valueOf(s3);
                if (s1.length() != 0)
                {
                    s1 = "Field cannot be set after initCall: ".concat(s1);
                } else
                {
                    s1 = new String("Field cannot be set after initCall: ");
                }
                gbh.a(s1, s2);
            }
            return;
        }
        s3 = String.valueOf(s3);
        if (s3.length() != 0)
        {
            s3 = "Field cannot be changed after initCall: ".concat(s3);
        } else
        {
            s3 = new String("Field cannot be changed after initCall: ");
        }
        gbh.a(s3, s1, s2);
    }

    public void a(int i1)
    {
        if (h == 4 || h == 3)
        {
            return;
        } else
        {
            f();
            h = 3;
            b.a(i1);
            return;
        }
    }

    public void a(gji gji1)
    {
        if (r != null)
        {
            r.a();
        }
        r = gji1;
        if (r == null)
        {
            b(true);
            return;
        } else
        {
            r.a(this);
            return;
        }
    }

    public void a(gjj gjj1)
    {
        if (s != null)
        {
            s.a();
        }
        s = gjj1;
        if (s != null)
        {
            s.a(this);
        }
    }

    public void a(gjl gjl1)
    {
        if (h != 0)
        {
            gkc.d("vclib", "Attempted to join a call that has already been joined.");
            return;
        }
        if (f != null) goto _L2; else goto _L1
_L1:
        a(a, gjl1);
_L4:
        f = gjl1;
        gkc.c("vclib", gjl1.toString());
        e.a(2689);
        h = 1;
        b.a(gjl1);
        b(j);
        return;
_L2:
        gjl gjl2 = f;
        a(gjl2.n(), gjl1.n(), false, "accountName");
        a(gjl2.a(), gjl1.a(), false, "sessionId");
        a(gjl2.b(), gjl1.b(), false, "participantLogId");
        a(gjl2.o(), gjl1.o(), false, "clientId");
        a(gjl2.p(), gjl1.p(), false, "gcmRegistration");
        a(gjl2.q(), gjl1.q(), false, "compressedLogFile");
        a(gjl2.f(), gjl1.f(), true, "resolvedHangoutId");
        if (gjl2.A() != null)
        {
            gbh.a("VideoCallOptions can not be modified after initCall.", kop.messageNanoEquals(gjl2.A(), gjl1.A()));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(gjm gjm1)
    {
        c.a(gjm1);
        if (h == 2)
        {
            gjm1.a(k);
            gem gem1 = d.b();
            if (gem1 != null)
            {
                gjm1.d(gem1.b());
            }
        }
    }

    public void a(gju gju)
    {
        l.a(gju);
    }

    public void a(gjv gjv1)
    {
        if (q != null)
        {
            q.g();
        }
        q = gjv1;
        if (q == null)
        {
            o.b().a(true);
            return;
        } else
        {
            gjv1 = o.b();
            gjv1.b(0);
            gjv1.a(60);
            gjv1.b(false);
            gjv1.a(null);
            q.a(this, gjv1);
            return;
        }
    }

    public void a(String s1)
    {
        if (h != 2)
        {
            gkc.d("vclib", "Attempted to mute participant while not in a call.");
            return;
        } else
        {
            b.a(s1);
            return;
        }
    }

    public void a(String s1, gju gju)
    {
        gbh.b("bindVideoToSurface requires a valid participantId", s1);
        gfo gfo = null;
        if ("localParticipant".equals(s1))
        {
            gfo = d.c().c();
        } else
        {
            gem gem1 = d.a(s1);
            if (gem1 != null)
            {
                gfo = gem1.c();
            }
        }
        if (gfo == null)
        {
            gkc.d("vclib", (new StringBuilder(String.valueOf(s1).length() + 90)).append("Attempted to bind video for participant: ").append(s1).append(" but there is no VideoSource for this participant").toString());
            return;
        } else
        {
            String s2 = String.valueOf(gju);
            gkc.a("vclib", (new StringBuilder(String.valueOf(s1).length() + 28 + String.valueOf(s2).length())).append("Binding video for ").append(s1).append(" surface: ").append(s2).toString());
            l.a(gju, gfo);
            return;
        }
    }

    public void a(boolean flag)
    {
        gem gem1 = d.c();
        if (gem1.d() == null)
        {
            d.a(new gbo(this, flag));
            return;
        }
        jay jay1 = new jay();
        jay1.a.a = i;
        jbr jbr1 = jay1.a.s;
        String s1;
        if (flag)
        {
            s1 = gem1.a();
        } else
        {
            s1 = "";
        }
        jbr1.a = s1;
        jay1.a.s.b = gem1.a();
        ((gau)g().a(gau)).b(jay1, new gbp(this));
    }

    public boolean a()
    {
        return h == 2;
    }

    public gjo b()
    {
        Object obj = null;
        gcg gcg1 = b.a();
        gjo gjo1 = (new gjo()).a(f).a(k);
        String s1;
        if (f == null)
        {
            s1 = null;
        } else
        {
            s1 = f.b();
        }
        gjo1 = gjo1.c(s1);
        if (gcg1 == null)
        {
            s1 = null;
        } else
        {
            s1 = gcg1.g();
        }
        gjo1 = gjo1.a(s1);
        if (gcg1 == null)
        {
            s1 = null;
        } else
        {
            s1 = gcg1.h();
        }
        gjo1 = gjo1.b(s1);
        if (gcg1 == null)
        {
            s1 = obj;
        } else
        {
            s1 = gcg1.p();
        }
        return gjo1.d(s1);
    }

    public void b(gjm gjm1)
    {
        c.b(gjm1);
    }

    public void b(String s1)
    {
        if (h != 2)
        {
            gkc.d("vclib", "Attempted to kick participant while not in a call.");
            return;
        } else
        {
            b.b(s1);
            return;
        }
    }

    public void b(boolean flag)
    {
        j = flag;
        h();
        gem gem1 = d.c();
        gho gho1 = gem1.d();
        if (gho1 != null)
        {
            gho1.a(flag);
        }
        gem1.f();
    }

    public gjv c()
    {
        return q;
    }

    public void c(String s1)
    {
        d.b(s1);
    }

    public gji d()
    {
        return r;
    }

    public gjj e()
    {
        return s;
    }

    void f()
    {
        if (!t)
        {
            a(((gjv) (null)));
            a(((gji) (null)));
            a(((gjj) (null)));
            o.a();
            p.b();
            d.a();
            n.a();
            l.a();
            e.b();
            t = true;
        }
    }

    public gbd g()
    {
        return b.c();
    }

    void h()
    {
        if (!g)
        {
            return;
        }
        gem gem1 = d.c();
        if (gem1.d() != null)
        {
            b.b(j);
            return;
        } else
        {
            d.a(new gbq(this, gem1));
            return;
        }
    }
}
