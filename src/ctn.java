// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpMediaType;
import com.google.api.client.http.MultipartContent;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public final class ctn extends cto
{

    private static final boolean a = false;
    private final MultipartContent b;

    public ctn(ani ani, int i, cut cut1, String s)
    {
        super(ani, i, cut1, "hangouts-upload", s);
        b = (new MultipartContent()).setContentParts(Arrays.asList(new HttpContent[] {
            new csj(q), cut1.p()
        }));
    }

    public String a()
    {
        return b.getMediaType().build();
    }

    public byte[] b()
    {
        if (a)
        {
            String s = String.valueOf(j());
            String s1 = String.valueOf(q);
            ebw.b("Babel_SendChatMessageMediaOperation", (new StringBuilder(String.valueOf(s).length() + 33 + String.valueOf(s1).length())).append("sending request to url ").append(s).append(" request: ").append(s1).toString());
        }
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(1024);
        try
        {
            b.writeTo(bytearrayoutputstream);
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException("Cannot create a byte array stream", ioexception);
        }
        return bytearrayoutputstream.toByteArray();
    }

    public Bundle c()
    {
        Bundle bundle = super.c();
        bundle.putString("uploadType", "multipart");
        return bundle;
    }

    static 
    {
        hik hik = ebw.k;
    }
}
