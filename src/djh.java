// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public final class djh
    implements dmf
{

    private static final long serialVersionUID = 1L;
    private String a;
    private String b;
    private String c;
    private jsh d;
    private jsh e;
    private jsh f;
    private long g;
    private boolean h;
    private boolean i;
    private int j;
    private String k;
    private int l;
    private int m;
    private String n;
    private String o;

    djh(dji dji1)
    {
        a = dji1.a;
        b = dji1.b;
        c = dji1.c;
        d = jsh.a(dji1.d);
        e = jsh.a(dji1.e);
        f = jsh.a(dji1.f);
        g = dji1.g;
        h = dji1.h;
        i = dji1.i;
        j = dji1.j;
        k = dji1.k;
        l = dji1.l;
        n = eev.a(new Throwable());
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        jsj jsj1;
        int i1;
        int j1;
        a = (String)objectinputstream.readObject();
        b = (String)objectinputstream.readObject();
        c = (String)objectinputstream.readObject();
        d = (jsh)objectinputstream.readObject();
        f = (jsh)objectinputstream.readObject();
        g = objectinputstream.readLong();
        h = objectinputstream.readBoolean();
        i = objectinputstream.readBoolean();
        j = objectinputstream.readInt();
        k = (String)objectinputstream.readObject();
        l = objectinputstream.readInt();
        m = objectinputstream.readInt();
        n = (String)objectinputstream.readObject();
        o = (String)objectinputstream.readObject();
        jsj1 = new jsj();
        if (objectinputstream.available() <= 0)
        {
            break MISSING_BLOCK_LABEL_398;
        }
        j1 = objectinputstream.readInt();
        i1 = 0;
_L2:
        Object obj;
        byte abyte0[];
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_398;
        }
        int k1 = objectinputstream.readInt();
        obj = atp.values()[k1];
        k1 = objectinputstream.readInt();
        abyte0 = new byte[k1];
        if (objectinputstream.read(abyte0, 0, k1) != k1)
        {
            throw new IOException("Unmarshall Attachment: The actual bytes read doesn't match the expected bytes.");
        }
        switch (ats.a[((atp) (obj)).ordinal()])
        {
        default:
            objectinputstream = String.valueOf(obj);
            eev.f("AttachmentUtils", (new StringBuilder(String.valueOf(objectinputstream).length() + 25)).append("invalid attachment type: ").append(objectinputstream).toString());
            objectinputstream = String.valueOf(obj);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(objectinputstream).length() + 25)).append("invalid attachment type: ").append(objectinputstream).toString());

        case 3: // '\003'
            break; /* Loop/switch isn't completed */

        case 4: // '\004'
            break MISSING_BLOCK_LABEL_383;

        case 1: // '\001'
        case 2: // '\002'
            obj = (ato)g.a(abyte0, atx.CREATOR);
            break;
        }
_L3:
        if (obj != null)
        {
            jsj1.c(obj);
        }
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        obj = (ato)g.a(abyte0, atv.CREATOR);
          goto _L3
        obj = (ato)g.a(abyte0, aua.CREATOR);
          goto _L3
        e = jsj1.a();
        objectinputstream.close();
        return;
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.writeObject(a);
        objectoutputstream.writeObject(b);
        objectoutputstream.writeObject(c);
        objectoutputstream.writeObject(d);
        objectoutputstream.writeObject(f);
        objectoutputstream.writeLong(g);
        objectoutputstream.writeBoolean(h);
        objectoutputstream.writeBoolean(i);
        objectoutputstream.writeInt(j);
        objectoutputstream.writeObject(k);
        objectoutputstream.writeInt(l);
        objectoutputstream.writeInt(m);
        objectoutputstream.writeObject(n);
        objectoutputstream.writeObject(o);
        if (e != null)
        {
            objectoutputstream.writeInt(e.size());
            for (int i1 = 0; i1 < e.size(); i1++)
            {
                objectoutputstream.writeInt(((ato)e.get(i1)).c.ordinal());
                ato ato1 = (ato)e.get(i1);
                Parcel parcel = Parcel.obtain();
                ato1.writeToParcel(parcel, 0);
                byte abyte0[] = parcel.marshall();
                parcel.recycle();
                objectoutputstream.writeInt(abyte0.length);
                objectoutputstream.write(abyte0);
            }

        }
        objectoutputstream.close();
    }

    public String a()
    {
        return a;
    }

    public void a(int i1)
    {
        m = i1;
    }

    public String b()
    {
        return b;
    }

    public void b(String s)
    {
        o = s;
    }

    public String c()
    {
        return c;
    }

    public jsh d()
    {
        return d;
    }

    public jsh e()
    {
        return e;
    }

    public jsh f()
    {
        return f;
    }

    public long g()
    {
        return g;
    }

    public boolean h()
    {
        return h;
    }

    public boolean i()
    {
        return i;
    }

    public int j()
    {
        return j;
    }

    public int k()
    {
        return m;
    }

    public String l()
    {
        return k;
    }

    public cdl m()
    {
        return new djg(this);
    }

    public int n()
    {
        return l;
    }

    public String o()
    {
        if (d.size() == 1)
        {
            String s = ((dmt)d.get(0)).b;
            if (g.w(s))
            {
                return s;
            }
        }
        return null;
    }

    public String toString()
    {
        String s = a;
        String s1 = b;
        String s2 = String.valueOf(d.toString());
        String s3 = String.valueOf(e.toString());
        boolean flag = h;
        boolean flag1 = i;
        int i1 = j;
        String s4 = k;
        long l1 = g;
        int j1 = m;
        String s5 = n;
        String s6 = o;
        return (new StringBuilder(String.valueOf(s).length() + 259 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length() + String.valueOf(s6).length())).append("SendMultiAttachmentRequest [clientGeneratedId=").append(s).append(", conversationId=").append(s1).append(", text=").append(s2).append(", attachments=").append(s3).append(", isOffRecord=").append(flag).append(", inContingency=").append(flag1).append(", transportType=").append(i1).append(", transportPhone=").append(s4).append(", sequenceNumber=").append(l1).append(", requestId=").append(j1).append(", creationStack=").append(s5).append(", originStack=").append(s6).append("]").toString();
    }
}
