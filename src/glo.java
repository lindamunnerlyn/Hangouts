// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class glo
{

    final gmm a;
    boolean b;
    int c;
    private float d;
    private float e;
    private float f;
    private float g;
    private boolean h;

    public glo(gmm gmm1)
    {
        d = 0.0F;
        e = 0.0F;
        f = 1.0F;
        g = 1.0F;
        h = true;
        c = 0;
        a = gmm1;
    }

    public void a()
    {
        if (!b) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!a.c())
        {
            b = true;
            a.a(new glp(this));
            return;
        }
        Object obj = a.h();
        gdm gdm1 = (gdm)((gdr) (obj)).a(gdm);
        switch (c)
        {
        default:
            jhh jhh1 = ((gdk)((gdr) (obj)).a(gdk)).a();
            obj = new jjf();
            obj.a = new jiz();
            ((jjf) (obj)).a.a = jhh1.a;
            ((jjf) (obj)).a.b = jhh1.b;
            ((jjf) (obj)).a.c = "2";
            ((jjf) (obj)).a.d = Integer.valueOf(2);
            ((jjf) (obj)).a.g = new jjd();
            if (f > 0.0F && g > 0.0F)
            {
                jje jje1 = new jje();
                jje1.a = Float.valueOf(d);
                jje1.b = Float.valueOf(e);
                jje1.c = Float.valueOf(f);
                jje1.d = Float.valueOf(g);
                ((jjf) (obj)).a.g.c = (new jje[] {
                    jje1
                });
            }
            if (h)
            {
                ((jjf) (obj)).a.g.a = Integer.valueOf(2);
            } else
            {
                ((jjf) (obj)).a.g.a = Integer.valueOf(1);
            }
            gdm1.a(((kws) (obj)), new glr(this));
            return;

        case 0: // '\0'
            c = 1;
            gdm1.a(new glq(this, gdm1));
            return;

        case 1: // '\001'
            break;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void a(float f1, float f2)
    {
        d = 0.0F;
        e = 0.0F;
        f = f1;
        g = f2;
    }

    public void a(boolean flag)
    {
        h = flag;
    }
}
