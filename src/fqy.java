// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.data.DataHolder;

public final class fqy extends fqs
{

    private final foi b;
    private final foh c;

    public fqy(DataHolder dataholder, foi foi, foh foh)
    {
        super(dataholder);
        b = foi;
        c = foh;
    }

    public Object a(int i)
    {
        return b(i);
    }

    public fqx b(int i)
    {
        return new fqi(a, i, d(), b, c);
    }

    public String toString()
    {
        return (new StringBuilder("People:size=")).append(a()).toString();
    }
}
