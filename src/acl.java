// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class acl
{

    int a;
    int b;
    final aci c;

    acl(aci aci1)
    {
        c = aci1;
        super();
    }

    int a()
    {
        if (b != aci.a(c).a)
        {
            throw new RuntimeException("BUG: Invalid call to getLength()");
        } else
        {
            return c.b - a;
        }
    }
}
