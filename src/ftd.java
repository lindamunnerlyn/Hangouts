// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.util.Base64;
import com.google.android.gms.wearable.Asset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class ftd
{

    private final Uri a;
    private final ftc b;

    private ftd(fsz fsz1)
    {
        a = fsz1.a();
        b = b((fsz)fsz1.e());
    }

    public static ftd a(fsz fsz1)
    {
        if (fsz1 == null)
        {
            throw new IllegalStateException("provided dataItem is null");
        } else
        {
            return new ftd(fsz1);
        }
    }

    private static ftc b(fsz fsz1)
    {
        if (fsz1.b() == null && fsz1.c().size() > 0)
        {
            throw new IllegalArgumentException("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
        }
        if (fsz1.b() == null)
        {
            return new ftc();
        }
        Object obj;
        int j;
        obj = new ArrayList();
        j = fsz1.c().size();
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        fta fta1 = (fta)fsz1.c().get(Integer.toString(i));
        if (fta1 == null)
        {
            try
            {
                throw new IllegalStateException((new StringBuilder("Cannot find DataItemAsset referenced in data at ")).append(i).append(" for ").append(fsz1).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            (new StringBuilder("Unable to parse datamap from dataItem. uri=")).append(fsz1.a()).append(", data=").append(Base64.encodeToString(fsz1.b(), 0));
            throw new IllegalStateException((new StringBuilder("Unable to parse datamap from dataItem.  uri=")).append(fsz1.a()).toString(), ((Throwable) (obj)));
        }
        ((List) (obj)).add(Asset.a(fta1.a()));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        obj = g.a(new fdc(fdd.a(fsz1.b()), ((List) (obj))));
        return ((ftc) (obj));
    }

    public Uri a()
    {
        return a;
    }

    public ftc b()
    {
        return b;
    }
}
