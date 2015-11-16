// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.AsyncTask;
import java.io.File;

public final class cox extends AsyncTask
{

    final Context a;

    public cox(Context context)
    {
        a = context;
        super();
    }

    private transient Void a()
    {
        Object obj = a;
        try
        {
            dql.y_();
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.intent.action.MEDIA_SCANNER_FINISHED");
            intentfilter.addDataPath(android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI.getPath(), 0);
            intentfilter.addDataScheme(android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI.getScheme());
            ((Context) (obj)).registerReceiver(new dqm(), intentfilter);
        }
        obj = ((Context) (obj)).getCacheDir();
        (new File(((File) (obj)), "telephony_brief_call_log")).delete();
        (new File(((File) (obj)), "telephony_brief_call_log_v2")).delete();
        return null;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a();
    }
}
