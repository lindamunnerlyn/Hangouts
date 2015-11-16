// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public final class ftb extends emm
    implements ekg
{

    private final Status b;

    public ftb(DataHolder dataholder)
    {
        super(dataholder);
        b = new Status(dataholder.e());
    }

    public Status B_()
    {
        return b;
    }

    protected Object a(int i, int j)
    {
        return new fuh(a, i, j);
    }

    protected String e()
    {
        return "path";
    }
}
