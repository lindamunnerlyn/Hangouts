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

public final class bsb extends brk
    implements dle
{

    private final bsd k = new bsd(this);
    private final bsc l = new bsc(this);
    private amy m;
    private bry n;

    public bsb(bqf bqf, gjr gjr1, ParticipantTrayView participanttrayview, FocusedParticipantView focusedparticipantview)
    {
        super(bqf, gjr1, participanttrayview, focusedparticipantview);
        a(gjr1.b());
    }

    static void a(bsb bsb1)
    {
        gbh.a(bsb1.a.l());
        bsb1.i();
        bsb1.g.a(bsb1.a.a());
        bsb1.i.setContentDescription(bsb1.a.b());
    }

    private void n()
    {
        bry bry1;
        if (j == null)
        {
            if (a.l())
            {
                if ((bry1 = l()) != null && bry1.c() != null)
                {
                    c(bry1.c());
                    return;
                }
            } else
            {
                String s = a.h();
                if (m != null)
                {
                    m.b();
                }
                dlb dlb1 = dlb.a(d.a());
                m = new amy(s, this);
                dlb1.a(m);
                return;
            }
        }
    }

    public void a(amy amy1)
    {
        m = null;
    }

    public void a(bot bot1)
    {
        super.a(bot1);
        b.a(k);
        c.a(l);
        n();
    }

    protected void a(gju gju)
    {
        c.a(a.a(), gju);
    }

    public void a(String s, String s1, amy amy1, String s2, ani ani)
    {
        m = null;
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
        if (m != null)
        {
            m.b();
            m = null;
        }
        b.b(k);
        c.b(l);
        super.b();
    }

    protected void c(int i)
    {
        int i1 = h;
        super.c(i);
        if (i1 != 1 && i == 1)
        {
            n();
        }
        if (i1 != 3 && i == 3)
        {
            bpd bpd1 = c.t();
            if (bpd1 != null)
            {
                bpd1.y();
            }
        }
    }

    Bitmap j()
    {
        if (j == null && a.l())
        {
            gbh.a(a.l());
            bry bry1 = l();
            int i;
            if (bry1 != null)
            {
                i = bry1.d();
            } else
            {
                i = 0;
            }
            if (i == 1)
            {
                return anv.o();
            }
        }
        return super.j();
    }

    public bry l()
    {
label0:
        {
            if (n != null || a == null)
            {
                break label0;
            }
            Object obj = gfd.a().b();
            if (obj == null)
            {
                break label0;
            }
            obj = ((gcg) (obj)).m();
            if (obj == null)
            {
                break label0;
            }
            obj = ((Collection) (obj)).iterator();
            gho gho1;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                gho1 = (gho)((Iterator) (obj)).next();
            } while (!gho1.a().equals(a.a()));
            if (gho1.s() instanceof bry)
            {
                n = (bry)gho1.s();
            }
        }
        return n;
    }

    void m()
    {
        i.setFocusable(false);
        i.setClickable(false);
        if (h())
        {
            f.e();
        }
        f.a(this);
    }
}
