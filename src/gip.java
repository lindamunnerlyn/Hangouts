// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gip extends gib
{

    private gio i;
    private gmw j;

    public gip()
    {
        super("Invalid");
    }

    public void a(gmw gmw1, gio gio1)
    {
        j = gmw1;
        i = gio1;
    }

    public boolean e()
    {
        if (i.e() == 0 || i.h() == 0 || i.i() == 0)
        {
            return false;
        } else
        {
            a(i.e(), i.h(), i.i(), i.f(), i.g());
            a(i.j());
            b(i.k());
            a(j.b(), j.c(), j.d());
            return super.e();
        }
    }
}
