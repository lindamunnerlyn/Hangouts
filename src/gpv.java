// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;

public class gpv
{

    private Context a;

    public gpv(Context context)
    {
        a = context;
    }

    public String a(int i)
    {
        String s;
        try
        {
            s = a.getResources().getResourceName(i);
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            return null;
        }
        return s;
    }
}
