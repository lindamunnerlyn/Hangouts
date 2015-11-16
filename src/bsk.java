// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageButton;
import com.google.android.apps.hangouts.hangout.FocusedParticipantView;
import com.google.android.apps.hangouts.hangout.ParticipantTrayView;
import java.util.Collection;
import java.util.Iterator;

public final class bsk extends brt
    implements dob
{

    private final bsm l = new bsm(this);
    private final bsl m = new bsl(this);
    private anq n;
    private bsh o;

    public bsk(bqo bqo, gmt gmt1, ParticipantTrayView participanttrayview, FocusedParticipantView focusedparticipantview)
    {
        super(bqo, gmt1, participanttrayview, focusedparticipantview);
        a(gmt1.b());
    }

    static void a(bsk bsk1)
    {
        gdv.a("Expected condition to be true", bsk1.a.l());
        bsk1.i();
        bsk1.g.a(bsk1.a.a());
        bsk1.i.setContentDescription(bsk1.a.b());
    }

    private void n()
    {
        bsh bsh1;
        if (k == null)
        {
            if (a.l())
            {
                if ((bsh1 = l()) != null && bsh1.c() != null)
                {
                    c(bsh1.c());
                    return;
                }
            } else
            {
                String s = a.h();
                if (n != null)
                {
                    n.b();
                }
                dny dny1 = dny.a(d.a());
                n = new anq(s, this);
                dny1.a(n);
                return;
            }
        }
    }

    public void a(anq anq1)
    {
        n = null;
    }

    public void a(bpc bpc1)
    {
        super.a(bpc1);
        b.a(l);
        c.a(m);
        n();
    }

    protected void a(gmw gmw)
    {
        c.a(a.a(), gmw);
    }

    public void a(String s, String s1, anq anq1, String s2, aoa aoa)
    {
        n = null;
        if (a.b().equals(s))
        {
            b(s2);
        }
        if (!TextUtils.isEmpty(s1))
        {
            c(s1);
        }
    }

    void b()
    {
        if (n != null)
        {
            n.b();
            n = null;
        }
        b.b(l);
        c.b(m);
        super.b();
    }

    protected void c(int i)
    {
        int k = h;
        super.c(i);
        if (k != 1 && i == 1)
        {
            n();
        }
        if (k != 3 && i == 3)
        {
            bpm bpm1 = c.s();
            if (bpm1 != null)
            {
                bpm1.x();
            }
        }
    }

    Bitmap j()
    {
        if (k == null && a.l())
        {
            gdv.a("Expected condition to be true", a.l());
            bsh bsh1 = l();
            int i;
            if (bsh1 != null)
            {
                i = bsh1.d();
            } else
            {
                i = 0;
            }
            if (i == 1)
            {
                return aon.o();
            }
        }
        return super.j();
    }

    public bsh l()
    {
label0:
        {
            if (o != null || a == null)
            {
                break label0;
            }
            Object obj = gic.a().b();
            if (obj == null)
            {
                break label0;
            }
            obj = ((geu) (obj)).m();
            if (obj == null)
            {
                break label0;
            }
            obj = ((Collection) (obj)).iterator();
            gkq gkq1;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                gkq1 = (gkq)((Iterator) (obj)).next();
            } while (!gkq1.a().equals(a.a()));
            if (gkq1.r() instanceof bsh)
            {
                o = (bsh)gkq1.r();
            }
        }
        return o;
    }

    void m()
    {
        i.setFocusable(false);
        i.setClickable(false);
        if (h())
        {
            f.f();
        }
        f.a(this);
    }
}
