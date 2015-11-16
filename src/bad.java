// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.view.View;
import com.google.android.apps.hangouts.conversation.v2.PreviewImageActivity;

public final class bad
    implements android.view.View.OnClickListener
{

    final PreviewImageActivity a;

    public bad(PreviewImageActivity previewimageactivity)
    {
        a = previewimageactivity;
        super();
    }

    public void onClick(View view)
    {
        view = a.getIntent();
        view.putExtra("result_media_attachment", a.j);
        a.setResult(-1, view);
        a.finish();
    }
}
