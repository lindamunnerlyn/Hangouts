// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public final class dmr extends dmp
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public final double i;
    public final double j;
    public final String k;

    protected dmr(kxc kxc1, kxy kxy1)
    {
        super(kxc1, kxy1.e, kxy1.f, a(kxy1.w), kxy1.c, "hangouts/location");
        if (dmo.e())
        {
            kxc1 = String.valueOf(d);
            if (kxc1.length() != 0)
            {
                kxc1 = "Received location: ".concat(kxc1);
            } else
            {
                kxc1 = new String("Received location: ");
            }
            eev.b("Babel", kxc1);
        }
        if (kxy1.n == null) goto _L2; else goto _L1
_L1:
        kxc1 = (kyt)kxy1.n.getExtension(kyt.a);
        if (kxc1 == null) goto _L2; else goto _L3
_L3:
        kxc1 = ((kyt) (kxc1)).s;
_L5:
        k = kxc1;
        kxc1 = (kxr)kxy1.o.getExtension(kxr.a);
        if (kxc1 == null)
        {
            i = 0.0D;
            j = 0.0D;
            return;
        } else
        {
            i = ((kxr) (kxc1)).n.doubleValue();
            j = ((kxr) (kxc1)).o.doubleValue();
            return;
        }
_L2:
        kxc1 = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public dmr(int ai[], String s, double d, double d1, String s1, 
            String s2, String s3)
    {
        super(ai, null, null, s, null, s2, s3, "hangouts/location");
        i = d;
        j = d1;
        k = s1;
    }

    public String toString()
    {
        String s = b;
        String s1 = this.d;
        double d = i;
        double d1 = j;
        String s2 = k;
        String s3 = f;
        return (new StringBuilder(String.valueOf(s).length() + 107 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append("id: ").append(s).append(" name: ").append(s1).append(" latitude: ").append(d).append(" longitude: ").append(d1).append(" address: ").append(s2).append(" staticMapUrl: ").append(s3).toString();
    }
}
