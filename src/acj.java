// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ByteArrayOutputStream;

final class acj
{

    int a;
    final aci b;
    private ack c;
    private ack d;

    acj(aci aci1)
    {
        b = aci1;
        super();
        c = null;
        d = null;
        a = 0;
    }

    void a()
    {
        if (d != null)
        {
            throw new RuntimeException("BUG: Invalid newbuf() before copy()");
        } else
        {
            ack ack1 = new ack();
            ack1.a = b.a;
            ack1.b = b.b;
            ack1.c = c;
            c = ack1;
            a = a + 1;
            b.a = new ByteArrayOutputStream();
            b.b = 0;
            return;
        }
    }

    void b()
    {
        ByteArrayOutputStream bytearrayoutputstream = b.a;
        int i = b.b;
        b.a = c.a;
        b.b = c.b;
        d = c;
        c = c.c;
        a = a - 1;
        d.a = bytearrayoutputstream;
        d.b = i;
    }

    void c()
    {
        b.a(d.a.toByteArray(), d.b);
        d = null;
    }

    acl d()
    {
        acl acl1 = new acl(b);
        acl1.a = b.b;
        acl1.b = a;
        return acl1;
    }
}
