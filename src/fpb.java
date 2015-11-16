// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;

public final class fpb extends eml
    implements fqq
{

    private final Bundle c;

    public fpb(DataHolder dataholder, int i, Bundle bundle)
    {
        super(dataholder, i);
        c = bundle;
    }

    public String a()
    {
        return b("circle_id");
    }

    public String b()
    {
        int j = a("type");
        int i = j;
        switch (j)
        {
        case 0: // '\0'
        default:
            i = -2;
            break;

        case -1: 
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            break;
        }
        if (i != -1)
        {
            Object obj = c.getBundle("localized_group_names");
            if (obj != null)
            {
                obj = ((Bundle) (obj)).getString(String.valueOf(i));
                if (!TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    return ((String) (obj));
                }
            }
        }
        return b("name");
    }
}
