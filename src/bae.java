// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.widget.Toast;
import com.google.android.apps.hangouts.conversation.v2.PreviewImageActivity;

public final class bae extends AsyncTask
{

    final Uri a;
    final Context b;
    final int c;
    final ContentResolver d;
    final PreviewImageActivity e;

    public bae(PreviewImageActivity previewimageactivity, Context context, int i, Uri uri)
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
        aobj = atp.a;
        if (e.k != null)
        {
            if (g.a(e.k, false))
            {
                aobj = atp.c;
            } else
            {
                aobj = atp.b;
            }
        }
        aobj = ava.a(b, c, ((atp) (aobj)), a, a.toString(), null);
        if (aobj == null)
        {
            cancel(false);
        }
        return ((Object) (aobj));
    }

    protected void onCancelled(Object obj)
    {
        obj = String.valueOf(a);
        eev.f("PreviewImage", (new StringBuilder(String.valueOf(obj).length() + 51)).append("Cancelled preview. Unable to create attachment for ").append(((String) (obj))).toString());
        obj = e.getString(g.kI);
        Toast.makeText(e, ((CharSequence) (obj)), 0).show();
        e.setResult(0, e.getIntent());
        e.finish();
    }

    protected void onPostExecute(Object obj)
    {
        boolean flag = false;
        obj = (atx)obj;
        Object obj1 = (new edq(((atx) (obj)).a, null)).b(false).a(1024);
        if (((atx) (obj)).c == atp.c)
        {
            flag = true;
        }
        obj1 = new aqn(((edq) (obj1)).c(flag), e, true, null);
        ((aqn) (obj1)).b(true);
        ((dpn)e.q.a(dpn)).a(((dor) (obj1)));
        e.j = ((atx) (obj));
    }
}
