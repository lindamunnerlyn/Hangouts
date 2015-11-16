// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.io.IOException;

public final class cby extends IOException
{

    private static final long serialVersionUID = 0xdc7cfe543af0a539L;

    public cby(int i, int j)
    {
        super((new StringBuilder("CodedOutputStream was writing to a flat byte array and ran out of space (pos ")).append(i).append(" limit ").append(j).append(").").toString());
    }

    public cby(Bundle bundle)
    {
        super((new StringBuilder("Blocked by rule: ")).append(bundle.getString("name")).toString());
    }

    public cby(String s, Throwable throwable)
    {
        super(s);
        initCause(throwable);
    }
}
