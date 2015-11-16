// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import java.util.List;

public final class ftj
{

    private final PutDataRequest a;
    private final ftc b = new ftc();

    public ftj(PutDataRequest putdatarequest, ftc ftc1)
    {
        a = putdatarequest;
        if (ftc1 != null)
        {
            b.a(ftc1);
        }
    }

    public static ftj a(String s)
    {
        return new ftj(PutDataRequest.a(s), null);
    }

    public Uri a()
    {
        return a.a();
    }

    public ftc b()
    {
        return b;
    }

    public PutDataRequest c()
    {
        fdc fdc1 = g.a(b);
        a.a(fdo.a(fdc1.a));
        int j = fdc1.b.size();
        for (int i = 0; i < j; i++)
        {
            String s = Integer.toString(i);
            Asset asset = (Asset)fdc1.b.get(i);
            if (s == null)
            {
                throw new IllegalStateException((new StringBuilder("asset key cannot be null: ")).append(asset).toString());
            }
            if (asset == null)
            {
                throw new IllegalStateException((new StringBuilder("asset cannot be null: key=")).append(s).toString());
            }
            if (Log.isLoggable("DataMap", 3))
            {
                (new StringBuilder("asPutDataRequest: adding asset: ")).append(s).append(" ").append(asset);
            }
            a.a(s, asset);
        }

        return a;
    }
}
