// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Environment;
import android.support.v4.content.FileProvider;
import com.google.android.apps.hangouts.conversation.v2.PreviewImageActivity;
import java.io.File;

public final class azg
{

    private static final String a;

    public static Intent a()
    {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        return intent;
    }

    public static Intent a(Context context)
    {
        Object obj = auj.a(1);
        if ("".equals(obj))
        {
            return null;
        }
        Object obj1 = new File(Environment.getExternalStorageDirectory(), ((String) (obj)));
        obj = Uri.fromFile(((File) (obj1)));
        obj1 = FileProvider.a(context, a, ((File) (obj1)));
        alw alw1 = (alw)hgx.a(context, alw);
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        boolean flag = alw1.a("babel_use_content_uri_for_camera", true);
        if (android.os.Build.VERSION.SDK_INT >= 16 && flag)
        {
            intent.putExtra("output", ((android.os.Parcelable) (obj1)));
            intent.setFlags(3);
            obj = context.getResources().getString(g.kD);
            intent.setClipData(ClipData.newUri(context.getContentResolver(), ((CharSequence) (obj)), ((Uri) (obj1))));
            intent.setFlags(3);
        } else
        {
            intent.putExtra("output", ((android.os.Parcelable) (obj)));
        }
        return intent;
    }

    public static Intent a(Context context, String s)
    {
        Intent intent = new Intent(context, com/google/android/apps/hangouts/conversation/v2/PreviewImageActivity);
        intent.putExtra("photo_url", s);
        intent.putExtra("account_id", ((gmo)hgx.a(context, gmo)).a());
        return intent;
    }

    public static Intent b(Context context, String s)
    {
        Intent intent = new Intent(context, com/google/android/apps/hangouts/conversation/v2/PreviewImageActivity);
        intent.putExtra("photo_url", s);
        intent.putExtra("is_video", true);
        intent.putExtra("account_id", ((gmo)hgx.a(context, gmo)).a());
        return intent;
    }

    static 
    {
        Class.forName("com.google.android.apps.hangouts.defaultbuild.EsProvider");
        String s = "com.google.android.apps.hangouts.conversation.v2";
_L2:
        a = s;
        return;
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        classnotfoundexception = "com.google.android.apps.hangouts.conversation.v2altbuild";
        if (true) goto _L2; else goto _L1
_L1:
    }
}
