// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.http.AbstractHttpContent;
import com.google.api.client.http.HttpMediaType;
import java.io.OutputStream;

public final class csj extends AbstractHttpContent
{

    private static final boolean b = false;
    final kop a;

    protected csj(kop kop1)
    {
        super("application/x-protobuf");
        a = kop1;
    }

    public long getLength()
    {
        int i = a.getSerializedSize();
        if (b)
        {
            String s = String.valueOf(a.toString());
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(s).length() + 56)).append("NanoProtoHttpContent serialized size: ").append(i).append(" proto=").append(s).toString());
        }
        return (long)i;
    }

    public AbstractHttpContent setMediaType(HttpMediaType httpmediatype)
    {
        return (csj)super.setMediaType(httpmediatype);
    }

    public void writeTo(OutputStream outputstream)
    {
        byte abyte0[] = kop.toByteArray(a);
        if (b)
        {
            int i = abyte0.length;
            String s = String.valueOf(toString());
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(s).length() + 51)).append("NanoProtoHttpContent write size: ").append(i).append(" proto=").append(s).toString());
        }
        outputstream.write(abyte0);
        outputstream.flush();
    }

    static 
    {
        hik hik = ebw.k;
    }
}
