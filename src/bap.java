// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.AsyncTask;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public final class bap extends AsyncTask
{

    private final Context a;
    private final int b;

    public bap(Context context)
    {
        a = context;
        b = ((gqu)hlp.a(context, gqu)).a();
    }

    private transient atx a(Intent aintent[])
    {
        aintent = (atx)aintent[0].getParcelableExtra("result_media_attachment");
        if (aintent == null)
        {
            eev.f("Babel", "Attachment is null, stop sending the attachment.");
            cancel(true);
        }
        atx atx1;
        try
        {
            atx1 = ava.a(a, b, ((atx) (aintent)).c, Uri.parse(((atx) (aintent)).a), ((atx) (aintent)).a, ((atx) (aintent)).d);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            eev.e("SendMediaAttachmentTask", "File too big to attach.", outofmemoryerror);
            return aintent;
        }
        return atx1;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Intent[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        obj = (atx)obj;
        if (obj != null)
        {
            avj avj1 = (avj)hlp.a(a, avj);
            ArrayList arraylist = new ArrayList(1);
            arraylist.add(obj);
            avj1.a(arraylist);
            return;
        } else
        {
            Toast.makeText(a, a.getResources().getString(g.ky), 0).show();
            return;
        }
    }
}
