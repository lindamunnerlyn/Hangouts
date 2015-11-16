// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.data.DataHolder;

public final class ftp extends ftj
{

    private final fre b;
    private final frd c;

    public ftp(DataHolder dataholder, fre fre, frd frd)
    {
        super(dataholder);
        b = fre;
        c = frd;
    }

    public Object a(int i)
    {
        return new ftb(a, i, d(), b, c);
    }

    public String toString()
    {
        return (new StringBuilder("People:size=")).append(a()).toString();
    }
}
