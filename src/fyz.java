// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fyz
    implements fvg
{

    private final String a;
    private final String b;

    public fyz(fvg fvg1)
    {
        a = fvg1.a();
        b = fvg1.b();
    }

    public boolean C_()
    {
        return true;
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public Object f()
    {
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("DataItemAssetEntity[");
        stringbuilder.append("@");
        stringbuilder.append(Integer.toHexString(hashCode()));
        if (a == null)
        {
            stringbuilder.append(",noid");
        } else
        {
            stringbuilder.append(",");
            stringbuilder.append(a);
        }
        stringbuilder.append(", key=");
        stringbuilder.append(b);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }
}
