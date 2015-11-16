// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;
import java.util.List;

final class awp
    implements ava
{

    final ave a;

    awp(ave ave1)
    {
        a = ave1;
        super();
    }

    public void a()
    {
        if (ave.aY(a))
        {
            ave.aZ(a);
        }
    }

    public void a(int i)
    {
        ave.a(a, new awr(this, i));
    }

    public void a(String s)
    {
        if (ave.aO(a))
        {
            ave.c(a, s);
            return;
        } else
        {
            ave.aP(a).add(new awq(this, s));
            ave.u(a);
            Toast.makeText(ave.aQ(a), l.jT, 1).show();
            return;
        }
    }

    public boolean b()
    {
        return ave.aY(a) && ave.ba(a).d();
    }

    public void c()
    {
        ave.aR(a);
    }

    public void d()
    {
        if (ave.aS(a)) goto _L2; else goto _L1
_L1:
        if (!ave.aT(a)) goto _L4; else goto _L3
_L3:
        ark ark1 = ave.o(a).a();
        hhb hhb = ave.aU(a);
        int i;
        if (ark1 != null && ark1.g)
        {
            i = l.sZ;
        } else
        {
            i = l.sY;
        }
        Toast.makeText(hhb, i, 1).show();
_L2:
        ave.am(a).b();
        ave.a(a, false);
        return;
_L4:
        if (ave.aV(a) != null && !ave.aV(a).a)
        {
            ave.aV(a).a(a.getContext(), false);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public boolean e()
    {
        if (ave.C(a) != null)
        {
            ave.a(a, true);
        }
        return false;
    }
}
