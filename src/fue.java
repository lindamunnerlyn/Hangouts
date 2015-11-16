// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.data.DataHolder;

public final class fue extends eml
    implements fta
{

    public fue(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public String a()
    {
        return b("asset_id");
    }

    public String b()
    {
        return b("asset_key");
    }

    public Object e()
    {
        return new fwv(this);
    }
}
