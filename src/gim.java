// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gim
{

    final gjk a;
    boolean b;
    int c;
    private float d;
    private float e;
    private float f;
    private float g;
    private boolean h;

    public gim(gjk gjk1)
    {
        d = 0.0F;
        e = 0.0F;
        f = 1.0F;
        g = 1.0F;
        h = true;
        c = 0;
        a = gjk1;
    }

    public void a()
    {
        d = 0.0F;
        e = 0.0F;
        f = 1.0F;
        g = 1.0F;
    }

    public void a(boolean flag)
    {
        h = flag;
    }

    public void b()
    {
        if (!b) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!a.a())
        {
            b = true;
            a.a(new gin(this));
            return;
        }
        Object obj = a.g();
        gay gay1 = (gay)((gbd) (obj)).a(gay);
        switch (c)
        {
        default:
            jba jba1 = ((gaw)((gbd) (obj)).a(gaw)).a();
            obj = new jcv();
            obj.a = new jcp();
            ((jcv) (obj)).a.a = jba1.a;
            ((jcv) (obj)).a.b = jba1.b;
            ((jcv) (obj)).a.c = "2";
            ((jcv) (obj)).a.d = Integer.valueOf(2);
            ((jcv) (obj)).a.g = new jct();
            if (f > 0.0F && g > 0.0F)
            {
                jcu jcu1 = new jcu();
                jcu1.a = Float.valueOf(d);
                jcu1.b = Float.valueOf(e);
                jcu1.c = Float.valueOf(f);
                jcu1.d = Float.valueOf(g);
                ((jcv) (obj)).a.g.c = (new jcu[] {
                    jcu1
                });
            }
            if (h)
            {
                ((jcv) (obj)).a.g.a = Integer.valueOf(2);
            } else
            {
                ((jcv) (obj)).a.g.a = Integer.valueOf(1);
            }
            gay1.a(((kop) (obj)), new gip(this));
            return;

        case 0: // '\0'
            c = 1;
            gay1.a(new gio(this, gay1));
            return;

        case 1: // '\001'
            break;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
