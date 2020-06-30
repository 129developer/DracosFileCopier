/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemover;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.codec.binary.Base64;
import org.tmatesoft.svn.core.SVNException;
import org.tmatesoft.svn.core.SVNURL;
import org.tmatesoft.svn.core.io.SVNRepository;
import org.tmatesoft.svn.core.wc.ISVNOptions;
import org.tmatesoft.svn.core.wc.SVNClientManager;

/**
 *
 * @author Admin
 */
public class SvnTest {

    public static void main(String[] args) {

        try {
            SVNClientManager clientManager = SVNClientManager.newInstance();
            File f = new File("D:\\PROJECTS\\CaravelSOAP\\.svn");
//            SVNRepository repo = clientManager.createRepository(SVNURL.fromFile(f), true);
//            SVNURL url = SVNURL.parseURIEncoded("http://192.168.10.101:18080/svn/bayaProjects/Base/Application/bayaTrade.desktop/");

            SVNURL url = SVNURL.create("svn", "mukil:mullassery", "192.168.10.101", 18080, "svn/bayaProjects/Base/Application/bayaTrade.desktop", true);
            SVNRepository repo = clientManager.getRepositoryPool().createRepository(url, true);

            System.out.println(repo.getLatestRevision());

        } catch (SVNException ex) {
            Logger.getLogger(SvnTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
