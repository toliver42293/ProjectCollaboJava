package com.firstgoogleapp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.google.appengine.api.datastore.Blob;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.EmbeddedEntity;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;

@SuppressWarnings("serial")
public class ProfileServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		
		
//		com.google.appengine.api.datastore.DatastoreService ds1 = DatastoreServiceFactory.getDatastoreService();
//
//		String[] skills = {
//				"accounting/actuary  ",
//				"acrobatics  ",
//				"acting  ",
//				"actuary insurance/claims  ",
//				"acupuncture  ",
//				"administration  ",
//				"advertising  ",
//				"aerodynamics  ",
//				"agriculture/agronomy  ",
//				"alchemy  ",
//				"analysis  ",
//				"anatomy  ",
//				"ancient history  ",
//				"animalcraft ",
//				"animal anatomy  ",
//				"animal behavior  ",
//				"animal disease  ",
//				"animal evaluation  ",
//				"animal genetics  ",
//				"animal handling  ",
//				"animal health  ",
//				"animal husbandry  ",
//				"animal lore  ",
//				"animal management  ",
//				"animal nutrition  ",
//				"animal selection  ",
//				"animal training  ",
//				"anisthesiology  ",
//				"anomolistics  ",
//				"anthropological linguistics  ",
//				"anthropology  ",
//				"antiques  ",
//				"appraisal  ",
//				"arbitration  ",
//				"archaeology  ",
//				"archery  ",
//				"architecture  ",
//				"archivist  ",
//				"area knowledge (area)  ",
//				"armorer  ",
//				"art commercial ",
//				"art drafting ",
//				"art painting ",
//				"art scultpure ",
//				"art history  ",
//				"art critic  ",
//				"artifact lore  ",
//				"astrogation  ",
//				"astrogeology  ",
//				"astrology  ",
//				"astronautics  ",
//				"astronomy  ",
//				"astrophysics  ",
//				"auto mechanic  ",
//				"autopsy  ",
//				"awareness ",
//				"backstab  ",
//				"banking general  ",
//				"bard  ",
//				"bargain  ",
//				"barter  ",
//				"battle-ready  ",
//				"bicycling  ",
//				"biochemistry  ",
//				"bioclimatology  ",
//				"bioelectricity  ",
//				"bioengineering  ",
//				"biofeedback  ",
//				"biology (bacteriology entomology)  ",
//				"biomechanics  ",
//				"biogeography  ",
//				"biomedicine  ",
//				"bionics  ",
//				"biophysics  ",
//				"biopsy  ",
//				"biotechnology  ",
//				"bioassay  ",
//				"bioastronautics  ",
//				"bioautography  ",
//				"hepatology  ",
//				"bioequivelance  ",
//				"biocatalyst  ",
//				"biocenosis  ",
//				"biochemistry  ",
//				"bioethics  ",
//				"bioenvironment  ",
//				"bioengineering  ",
//				"biofeedback  ",
//				"biointrumentation  ",
//				"biology  ",
//				"biomaterial reconstruction (prosthetics)  ",
//				"biomedicine  ",
//				"biomonitoring  ",
//				"bionics  ",
//				"bionomics  ",
//				"biophysics  ",
//				"biopsy  ",
//				"bioscience  ",
//				"biosensors  ",
//				"biospeleology  ",
//				"biostereometrics  ",
//				"biosynthesis  ",
//				"biotelemetry  ",
//				"biotranspformation  ",
//				"biomorphology  ",
//				"biomolecular fusion (gene sequencing)  ",
//				"biomolecular fission (gene splicing)  ",
//				"blacksmith  ",
//				"blindfighting  ",
//				"boating  ",
//				"bootlicking  ",
//				"boozing  ",
//				"botany  ",
//				"bowyer  ",
//				"boxing  ",
//				"brainwashing  ",
//				"brawling  ",
//				"breath control  ",
//				"brewing  ",
//				"bribery  ",
//				"bugging ",
//				"bureaucratics ",
//				"business  ",
//				"calligraphy  ",
//				"camouflage  ",
//				"camping  ",
//				"candlemaking  ",
//				"caravan (drive)  ",
//				"carousing  ",
//				"carpentry  ",
//				"cartography  ",
//				"chariot (drive)  ",
//				"charm  ",
//				"chemical hydrology  ",
//				"chemistry  ",
//				"chiropractic  ",
//				"chromatography  ",
//				"chronography  ",
//				"climatology  ",
//				"climbing  ",
//				"coach (drive)  ",
//				"coach (sports)  ",
//				"cobbler  ",
//				"coding  ",
//				"commodities  ",
//				"communication systems technology  ",
//				"comparative religion  ",
//				"computer operation  ",
//				"computer programming  ",
//				"computer technology  ",
//				"computer science general  ",
//				"computer theory  ",
//				"con  ",
//				"conceal  ",
//				"connoiseur  ",
//				"conservation ",
//				"construction  ",
//				"contortionist  ",
//				"conversation  ",
//				"cooking  ",
//				"cooper  ",
//				"corrections  ",
//				"cosmetology  ",
//				"cosmology  ",
//				"counter-espionage  ",
//				"counterfeit/identify  ",
//				"courtesan  ",
//				"craft/create  ",
//				"credit rating  ",
//				"criminology  ",
//				"cryptography  ",
//				"cryptozoology  ",
//				"cusine ",
//				"cultures  ",
//				"current events  ",
//				"customs inspection  ",
//				"cybernetics  ",
//				"cytology  ",
//				"damage control  ",
//				"dancing  ",
//				"deduction  ",
//				"demolition  ",
//				"dendrochronology  ",
//				"dentistry  ",
//				"dermatology  ",
//				"detect lies (psych)  ",
//				"diagnose  ",
//				"dietician  ",
//				"diplomacy  ",
//				"disguise  ",
//				"diving  ",
//				"dodge  ",
//				"drama theater arts ",
//				"drawing ",
//				"drive (Automobiles MotorCycles Heavy Equipment Military Vehicles)  ",
//				"drugs  ", "dry cleaning  ", "endocrinology  ", "ecology  ",
//				"economics  ", "education  ", "electronic countermeasures  ",
//				"electronics operation  ", "electronics technology  ",
//				"embalming ", "embryology  ", "energy systems  ",
//				"engineering general  ", "engineering aerospace  ",
//				"engineering automotive  ", "engineering civil  ",
//				"engineering electrical  ", "engineering naval  ",
//				"engineering environmental  ", "engineering mining  ",
//				"engineering nuclear  ", "entomology  ",
//				"environmental geology  ", "epidemiology  ", "escape  ",
//				"espionage  ", "etiquette  ", "ethology  ", "ethnology  ",
//				"evaluate  ", "explosives  ", "extreme sports ",
//				"fabrication metal ", "fabrication wood ",
//				"fabrication plastic ", "falconry  ",
//				"familiarity (subject)  ", "farming  ", "fast-draw  ",
//				"fast-talk  ", "fencing  ", "filching  ", "filmmaking  ",
//				"fine arts  ", "firearms  ", "firebuilding  ", "first aid  ",
//				"fishing  ", "fitness  ", "fletcher  ", "fluid mechanics  ",
//				"forgery  ", "foraging  ", "forensics  ", "forestry  ",
//				"forward observer  ", "freefall  ", "gadgetry  ", "gambling  ",
//				"gaming (type)  ", "gastroenterology  ", "gemcutting  ",
//				"general physical science  ", "general earth-space science  ",
//				"general practice/family medicine  ", "genetics  ",
//				"genetic engineering (cloning)  ", "geochemistry  ",
//				"geochronology  ", "geography  ", "geology  ",
//				"geomorphology  ", "geophysics  ", "gesture  ",
//				"gastrointerology  ", "geriatrics  ", "glassblower  ",
//				"golf course management  ", "gourmet  ",
//				"graphology/forgery  ", "gunner  ", "gunsmith  ",
//				"gymnastics  ", "H.A.M.  ", "handwriting analysis  ",
//				"hang-gliding  ", "hawking  ", "health sciences  ",
//				"heavy weapons  ", "hematology  ", "hepatology  ",
//				"high society ", "homeopathy  ", "heraldry  ", "herbalism  ",
//				"herding  ", "herpatology  ", "hiding  ", "history  ",
//				"holdout  ", "hologram  ", "hunting  ", "hygiene  ",
//				"hydrology  ", "hydrometeorology  ", "hydroponics  ",
//				"hypnotism  ", "ichthyology  ", "identify  ", "illustarator  ",
//				"immunology  ", "improvisation  ", "impersonation  ",
//				"industrial trade  ", "instruction  ",
//				"intelligence analysis  ", "internet  ", "interrogation  ",
//				"investigation  ", "intimidation  ", "investigation  ",
//				"jack of all trades  ", "jeweler  ", "journalism  ",
//				"jousting  ", "juggling/sideshow  ", "jumping  ", "language  ",
//				"laser technology  ", "lasso  ", "laundry  ", "law  ",
//				"leadership  ", "leatherworking  ", "legends/lore  ",
//				"legerdemain ", "liason  ", "library science  ",
//				"library use  ", "linguistics  ", "lip reading  ", "listen  ",
//				"literacy language  ", "literature  ", "lockpicking  ",
//				"locksmith ", "lovecraft  ", "lying  ", "machinist  ",
//				"macrobiology  ", "mammology  ", "manual labor  ",
//				"marine geology  ", "marine geophysics  ", "marketing  ",
//				"martial arts  ", "massage  ", "masonry  ", "mathematics  ",
//				"mechanics  ", "melee weapon  ", "medicine  ", "merchant  ",
//				"metalcraft ", "metallurgy  ", "metaphysics  ",
//				"meteorology  ", "microbilogy  ", "microwave technology ",
//				"mid-wife  ", "milling ", "military operations  ",
//				"military science  ", "mimicry ", "mindblock  ",
//				"minerology  ", "mining  ", "modeling  ",
//				"molecular biology  ", "motivation  ", "mountaineering  ",
//				"move silently  ", "musical instrument  ",
//				"music appreciation  ", "mysticism  ", "natural history  ",
//				"naturalist  ", "navigation  ", "negotiation  ", "neurology  ",
//				"neuro-physiology  ", "nuclear physics  ", "nephrology  ",
//				"orthopedics  ", "oncology  ", "observation  ",
//				"obstetrics/gynecology  ", "oceanography  ", "occult lore  ",
//				"optics  ", "optometry  ", "osteopathy  ", "oratory  ",
//				"ornithology  ", "orthodontics  ", "packing  ",
//				"paleaentology  ", "palynlogy  ", "paleoclimatology  ",
//				"pantomime  ", "parachute  ", "paramedic  ",
//				"parapsychology  ", "parasailing  ", "parasitology  ",
//				"pathology  ", "pediatrics  ", "pedology  ", "performance  ",
//				"persuasion  ", "petrology  ", "pharmacy  ", "photography  ",
//				"philosophy  ", "physical education  ",
//				"physical science general  ", "physics  ", "physiology  ",
//				"pick pocket  ", "pilot (Aircraft Boats)  ", "plumbing  ",
//				"podiatry  ", "poetry  ", "poisons  ", "police procedure  ",
//				"politics  ", "pottery  ", "practical jokes  ",
//				"prestidigitation  ", "propaganda  ", "prospecting  ",
//				"prosthetics  ", "proctology  ", "protozoology  ",
//				"psionics* ", "psychoanalysis  ", "psychology  ",
//				"public speaking  ", "public service  ", "quick-draw  ",
//				"radiation technology  ", "radio  ", "radiology  ",
//				"random theories  ", "range management  ", "read/write  ",
//				"recreational activities  ", "religion  ", "research  ",
//				"rhetoric ", "ride (Animals)  ", "robotics  ", "rope use  ",
//				"running  ", "rheumatology  ", "sabotage  ", "safecracking  ",
//				"savoir-faire  ", "seafaring  ", "security system ",
//				"sewing  ", "scrounging  ", "S.C.U.B.A.  ", "sculpting  ",
//				"seismology  ", "security systems/procedures  ",
//				"sedimentology  ", "seduction  ", "seismology  ",
//				"semaphore  ", "sex appeal  ", "shadowing  ", "shipbuilding  ",
//				"shiphandling  ", "sign language  ", "singing  ",
//				"skate (Board Inline Ice)  ", "ski (Water Snow)  ", "sled  ",
//				"sleight of hand ", "small equipment systems  ", "smuggling  ",
//				"sneak  ", "streetwise ", "social sciences  ", "sociology  ",
//				"spacecraft operation  ", "spacecraft technology  ",
//				"speak language  ", "spells*  ", "spelunking  ", "sports  ",
//				"spot hidden  ", "stand-up comedy  ", "statistics  ",
//				"stealth  ", "steward  ", "stormchasing  ", "storytelling  ",
//				"strategy  ", "streetwise  ", "surf (Wave Wind)  ",
//				"Survival ", "surveillance  ", "surveillance technology  ",
//				"survival  ", "swimming  ", "tactics  ", "tanning (furrier)  ",
//				"taxidermy  ", "taxonomy  ", "taylor/seamstress  ",
//				"team driving  ", "tectonics  ", "telegraphy  ",
//				"telekinesis  ", "television repair  ",
//				"television production  ", "teratology  ", "theology  ",
//				"thermodynamics  ", "throw  ", "thrown weapon  ",
//				"tightrope walking  ", "timbercraft ", "topography  ",
//				"torture  ", "toxicology  ", "tracking  ", "trading ",
//				"trivia   ", "trapcraft  ", "trivia  ", "tumbling  ",
//				"underwater demolition  ", "urban legends  ", "urology  ",
//				"ufology  ", "ventriloquism  ", "veterinary  ",
//				"video equipment  ", "voice mimicry  ", "vulcanology  ",
//				"weaponsmith  ", "weapon lore  ", "weaving  ", "wheelwright  ",
//				"wildlife  ", "woodworking  ", "wrestling  ",
//				"professional writing ", "technical writing ",
//				"creative writing ", "xenobiology  ", "xenobotany  ",
//				"x-ray operation  ", "x-ray repair  ", "zoology" };
//		
//		for(String skill: skills){
//			ds1.put(new Entity("Skill", skill.substring(0, 1).toUpperCase() + skill.substring(1)));
//		}
		
		HttpSession session = req.getSession();
		if(session.getAttribute("id") != null){
			//User is logged in
			//Get datastore service
			com.google.appengine.api.datastore.DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
			Entity e;
			try {
				//Entity e is current logged in user
				e = ds.get(new Entity("User", (String)session.getAttribute("email")).getKey());
				//Request attribute to hold user information
				req.setAttribute("user", getUser(e));

//				System.out.println("ProfileServlet: Sending '" + (String)session.getAttribute("email")+"profilePicture" + "'");
				Image image = getImage((String)session.getAttribute("email")+"profilePicture");
				if(image != null && image.getImageType() != null && image.getImage() != null){
//					System.out.println("ProfileServlet: valid image");
//					resp.setContentType(image.getImageType());
//					resp.getOutputStream().write(image.getImage());
					session.setAttribute("image", image.getImage());
					
					
				}
			} catch (EntityNotFoundException e1) {
				e1.printStackTrace();
			}
//			req.getRequestDispatcher("/WEB-INF/myprofile-main.jsp").forward(req, resp);
		}else{
			req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		if(session.getAttribute("id") != null){
			//User is logged in
			//Get datastore service
			com.google.appengine.api.datastore.DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
			Entity e;
			try {
				//Entity e is current logged in user
				e = ds.get(new Entity("User", (String)session.getAttribute("email")).getKey());
				//Request attribute to hold user information
				req.setAttribute("user", getUser(e));

				System.out.println("ProfileServlet: Sending '" + (String)session.getAttribute("email")+"profilePicture" + "'");
				Image image = getImage((String)session.getAttribute("email")+"profilePicture");
				if(image != null && image.getImageType() != null && image.getImage() != null){
					System.out.println("ProfileServlet: valid image");
					resp.setContentType(image.getImageType());
					resp.getOutputStream().write(image.getImage());
				}
				System.out.println("ProfileServlet: not valid image");
			} catch (EntityNotFoundException e1) {
				e1.printStackTrace();
			}
			req.getRequestDispatcher("/WEB-INF/myprofile-main.jsp").forward(req, resp);
		}else{
			req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
		}
	}
	
	/**
	 * 
	 * @param e		Current user Entity object
	 * @return		Return User object
	 */
	private User getUser(Entity e){
		//Fields to store in User object to return
		String name = (String)e.getProperty("firstName") + " " + e.getProperty("lastName");
		String skillSet = (String)e.getProperty("skillSet");
		String workExperience = (String)e.getProperty("workExperience");
		String education = (String)e.getProperty("education");
		String aboutMe = (String)e.getProperty("aboutMe");
		String hobbies = (String)e.getProperty("hobbies");
		String interests = (String)e.getProperty("interests");
		Long numFriends = (Long)e.getProperty("numFriends");
//		System.out.println("ProfileServlet.java: numFriends=" + numFriends + " and numFriends=" + numFriends.intValue());
		EmbeddedEntity m = (EmbeddedEntity)e.getProperty("friends");
		ArrayList<String> friends = new ArrayList<String>();
		try {
			//Get datastore service
			com.google.appengine.api.datastore.DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
			//Build list of friends names
			for(Long i = 0L; i < numFriends; i++){
				Entity en = ds.get((Key)m.getProperty(String.valueOf(i)));
				String fullName = (String)en.getProperty("firstName") + " " + en.getProperty("lastName");
				friends.add(fullName);
			}
		} catch (EntityNotFoundException e1) {
			e1.printStackTrace();
		}
		return new User(name,skillSet,workExperience,education,aboutMe,hobbies,interests,numFriends.intValue(),friends);
	}
	
	/**
     * Queries the datastore for the Image object with the passed-in title. If
     * found, returns the Image object; otherwise, returns null.
     *
     * @param title image title to look up
     */
    private Image getImage(String title) {
        PersistenceManager pm = PMF.get().getPersistenceManager();

        // Search for any Image object with the passed-in title; limit the number
        // of results returned to 1 since there should be at most one image with
        // a given title
        Query query = pm.newQuery(Image.class, "title == titleParam");
        query.declareParameters("String titleParam");
        query.setRange(0, 1);

        try {
            List<Image> results = (List<Image>) query.execute(title);
            if (results.iterator().hasNext()) {
                // If the results list is non-empty, return the first (and only)
                // result
                return results.get(0);
            }
        } finally {
            query.closeAll();
            pm.close();
        }

        return null;
    }
}
