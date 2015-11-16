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

public final class baa extends AsyncTask
{

    private final Context a;
    private final int b;

    public baa(Context context)
    {
        a = context;
        b = ((gmo)hgx.a(context, gmo)).a();
    }

    private transient atg a(Intent aintent[])
    {
        aintent = (atg)aintent[0].getParcelableExtra("result_media_attachment");
        if (aintent == null)
        {
            ebw.f("Babel", "Attachment is null, stop sending the attachment.");
            cancel(true);
        }
        atg atg1;
        try
        {
            atg1 = auj.a(a, b, ((atg) (aintent)).c, Uri.parse(((atg) (aintent)).a), ((atg) (aintent)).a, ((atg) (aintent)).d);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            ebw.e("SendMediaAttachmentTask", "File too big to attach.", outofmemoryerror);
            return aintent;
        }
        return atg1;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Intent[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        obj = (atg)obj;
        if (obj != null)
        {
            aus aus1 = (aus)hgx.a(a, aus);
            ArrayList arraylist = new ArrayList(1);
            arraylist.add(obj);
            aus1.a(arraylist);
            return;
        } else
        {
            Toast.makeText(a, a.getResources().getString(g.kF), 1).show();
            return;
        }
    }
}
