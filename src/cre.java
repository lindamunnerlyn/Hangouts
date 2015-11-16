// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import com.google.android.apps.hangouts.phone.ViewVCardActivity;
import java.util.Locale;

public final class cre extends AsyncTask
{

    int a;
    final ViewVCardActivity b;

    public cre(ViewVCardActivity viewvcardactivity)
    {
        b = viewvcardactivity;
        super();
        a = ViewVCardActivity.b(b).a();
    }

    protected Object doInBackground(Object aobj[])
    {
        aobj = ((Uri[])aobj)[0];
        if (aobj != null)
        {
            return ((Object) (aobj));
        } else
        {
            return ViewVCardActivity.a(b, a);
        }
    }

    protected void onPostExecute(Object obj)
    {
        obj = (Uri)obj;
        if (obj != null)
        {
            ViewVCardActivity.a(b, ((Uri) (obj)));
            obj = new Intent();
            ((Intent) (obj)).setAction("android.intent.action.VIEW");
            ((Intent) (obj)).setDataAndType(ViewVCardActivity.c(b), "text/x-vCard".toLowerCase(Locale.US));
            ((Intent) (obj)).addFlags(1);
            b.startActivity(((Intent) (obj)));
        }
    }
}
