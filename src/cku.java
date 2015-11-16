// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import com.google.android.apps.hangouts.phone.BabelHomeActivity;

public final class cku extends AsyncTask
{

    final BabelHomeActivity a;

    public cku(BabelHomeActivity babelhomeactivity)
    {
        a = babelhomeactivity;
        super();
    }

    protected Object doInBackground(Object aobj[])
    {
        if (def.c() != null)
        {
            def.c().g();
        }
        return null;
    }
}
