// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.widget.Toast;
import com.google.android.apps.hangouts.conversation.v2.PreviewImageActivity;

public final class azp extends AsyncTask
{

    final Uri a;
    final Context b;
    final int c;
    final ContentResolver d;
    final PreviewImageActivity e;

    public azp(PreviewImageActivity previewimageactivity, Context context, int i, Uri uri)
    {
        e = previewimageactivity;
        super();
        b = context;
        a = uri;
        c = i;
        d = context.getContentResolver();
    }

    protected Object doInBackground(Object aobj[])
    {
        aobj = asz.a;
        if (e.j != null)
        {
            if (g.a(e.j, false))
            {
                aobj = asz.c;
            } else
            {
                aobj = asz.b;
            }
        }
        aobj = auj.a(b, c, ((asz) (aobj)), a, a.toString(), null);
        if (aobj == null)
        {
            cancel(false);
        }
        return ((Object) (aobj));
    }

    protected void onCancelled(Object obj)
    {
        obj = String.valueOf(a);
        ebw.f("PreviewImage", (new StringBuilder(String.valueOf(obj).length() + 51)).append("Cancelled preview. Unable to create attachment for ").append(((String) (obj))).toString());
        obj = e.getString(g.kQ);
        Toast.makeText(e, ((CharSequence) (obj)), 1).show();
        e.setResult(0, e.getIntent());
        e.finish();
    }

    protected void onPostExecute(Object obj)
    {
        boolean flag = false;
        obj = (atg)obj;
        Object obj1 = (new eam(((atg) (obj)).a, null)).b(false).a(1024);
        if (((atg) (obj)).c == asz.c)
        {
            flag = true;
        }
        obj1 = new apw(((eam) (obj1)).c(flag), e, true, null);
        ((apw) (obj1)).b(true);
        ((dmt)PreviewImageActivity.a(e).a(dmt)).a(((dlt) (obj1)));
        PreviewImageActivity.a(e, ((atg) (obj)));
    }
}
