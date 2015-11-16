// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fdj;
import g;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTeleporter
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new fdj();
    final int a;
    ParcelFileDescriptor b;
    final String c;
    final String d;
    private byte e[];
    private File f;

    public FileTeleporter(int i, ParcelFileDescriptor parcelfiledescriptor, String s, String s1)
    {
        a = i;
        b = parcelfiledescriptor;
        c = s;
        d = s1;
    }

    public FileTeleporter(byte abyte0[], String s, String s1)
    {
        this(1, null, s, s1);
        e = abyte0;
    }

    private FileOutputStream a()
    {
        if (f == null)
        {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
        }
        File file;
        FileOutputStream fileoutputstream;
        try
        {
            file = File.createTempFile("teleporter", ".tmp", f);
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException("Could not create temporary file", ioexception);
        }
        try
        {
            fileoutputstream = new FileOutputStream(file);
            b = ParcelFileDescriptor.open(file, 0x10000000);
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            throw new IllegalStateException("Temporary file is somehow already deleted");
        }
        file.delete();
        return fileoutputstream;
    }

    private static void a(Closeable closeable)
    {
        try
        {
            closeable.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Closeable closeable)
        {
            return;
        }
    }

    public void a(File file)
    {
        if (file == null)
        {
            throw new NullPointerException("Cannot set null temp directory");
        } else
        {
            f = file;
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        DataOutputStream dataoutputstream;
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        dataoutputstream = new DataOutputStream(a());
        dataoutputstream.writeInt(e.length);
        dataoutputstream.writeUTF(c);
        dataoutputstream.writeUTF(d);
        dataoutputstream.write(e);
        a(dataoutputstream);
        int j = g.p(parcel, 20293);
        g.b(parcel, 1, a);
        g.a(parcel, 2, b, i);
        g.a(parcel, 3, c);
        g.a(parcel, 4, d);
        g.q(parcel, j);
        return;
        parcel;
        throw new IllegalStateException("Could not write into unlinked file", parcel);
        parcel;
        a(dataoutputstream);
        throw parcel;
    }

}
